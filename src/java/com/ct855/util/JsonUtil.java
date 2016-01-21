package com.ct855.util;

import org.codehaus.jackson.map.DeserializationConfig.Feature;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import java.io.IOException;
import java.text.SimpleDateFormat;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

/**
 * * JSON的工具类 * * <h3>Here is an example:</h3>
 * * <pre> * // 将json通过类型转换成对象 * {@link JsonUtil JsonUtil}.fromJson("{\"username\":\"username\", \"password\":\"password\"}", User.class);
 * * </pre> * <hr />
 * <pre> * // 传入转换的引用类型 * {@link JsonUtil JsonUtil}.fromJson("[{\"username\":\"username\", \"password\":\"password\"}, {\"username\":\"username\", \"password\":\"password\"}]", new TypeReference&lt;List&lt;User&gt;&gt;);
 * * </pre> * <hr />
 * <pre> * // 将对象转换成json * {@link JsonUtil JsonUtil}.toJson(user); * </pre> *
 * <hr />
 * <pre> * // 将对象转换成json, 可以设置输出属性 * {@link JsonUtil JsonUtil}.toJson(user, {@link Inclusion Inclusion.ALWAYS});
 * * </pre> * <hr />
 * <pre> * // 将对象转换成json, 传入配置对象 * {@link ObjectMapper ObjectMapper} mapper = new ObjectMapper(); * mapper.setSerializationInclusion({@link Inclusion Inclusion.ALWAYS}); * mapper.configure({@link Feature Feature.FAIL_ON_UNKNOWN_PROPERTIES}, false); * mapper.configure({@link Feature Feature.FAIL_ON_NUMBERS_FOR_ENUMS}, true); * mapper.setDateFormat(new {@link SimpleDateFormat SimpleDateFormat}("yyyy-MM-dd HH:mm:ss")); * {@link JsonUtil JsonUtil}.toJson(user, mapper);
 * * </pre> * <hr />
 * <pre> * // 获取Mapper对象 * {@link JsonUtil JsonUtil}.mapper(); * </pre> * * @see
 * JsonUtil JsonUtil * @see Feature Feature * @see ObjectMapper ObjectMapper *
 * @see Inclusion Inclusion * @see IOException IOException * @see
 * SimpleDateFormat SimpleDateFormat *
 */
@SuppressWarnings("unchecked")
public final class JsonUtil {

    private static final Logger log = Logger.getLogger(JsonUtil.class);
    private static final ObjectMapper MAPPER;

    static {
        //MAPPER = generateMapper(Inclusion.ALWAYS);
        MAPPER = generateMapper(Inclusion.NON_NULL);
    }

    private JsonUtil() {
    }

    /**
     * * 将json通过类型转换成对象
     * * <pre> * {@link JsonUtil JsonUtil}.fromJson("{\"username\":\"username\", \"password\":\"password\"}", User.class);
     * * </pre> * 
     * @param <T>
     * @param json json字符串 
     * @param clazz 泛型类型 
     * @return 返回对象 
     */
    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return clazz.equals(String.class) ? (T) json : MAPPER.readValue(json, clazz);
        } catch (IOException ex) {
            log.error(json + " 无法转换为 " + clazz.getName() + " 对象!", ex);
        }
        return null;
    }

    /**
     * * 将json通过类型转换成对象
     * * <pre> * {@link JsonUtil JsonUtil}.fromJson("[{\"username\":\"username\", \"password\":\"password\"}, {\"username\":\"username\", \"password\":\"password\"}]", new TypeReference&lt;List&lt;User&gt;&gt;);
     * * </pre> * 
     * @param <T>
     * @param json json字符串 
     * @param typeReference 引用类型
     * @return 返回对象 
     */
    public static <T> T fromJson(String json, TypeReference<?> typeReference) {
        try {
            return (T) (typeReference.getType().equals(String.class) ? json : MAPPER.readValue(json, typeReference));
        } catch (IOException ex) {
            log.error(json + " 无法转换为 " + typeReference.getClass().getName() + " 对象!", ex);
        }
        return null;
    }

    /**
     * * 将对象转换成json
     * * <pre> * {@link JsonUtil JsonUtil}.toJson(user); * </pre> * 
     * @param <T>
     * @param src 对象 
     * @return 返回json字符串
     */
    public static <T> String toJson(T src) {
        try {
            return src instanceof String ? (String) src : MAPPER.writeValueAsString(src);
        } catch (IOException ex) {
            log.error("目标对象 " + src.getClass().getName() + " 转换 JSON 字符串时，发生异常！", ex);
        }
        return null;
    }

    /**
     * * 将对象转换成json, 可以设置输出属性
     * * <pre> * {@link JsonUtil JsonUtil}.toJson(user, {@link Inclusion Inclusion.ALWAYS});
     * * </pre> * * {@link Inclusion Inclusion 对象枚举} * <ul> *
     * <li>{@link Inclusion Inclusion.ALWAYS 全部列入}</li> *
     * <li>{@link Inclusion Inclusion.NON_DEFAULT 字段和对象默认值相同的时候不会列入}</li> *
     * <li>{@link Inclusion Inclusion.NON_EMPTY 字段为NULL或者""的时候不会列入}</li> *
     * <li>{@link Inclusion Inclusion.NON_NULL 字段为NULL时候不会列入}</li> * </ul> * *
     * @param <T>
     * @param src 对象 
     * @param inclusion 传入一个枚举值, 设置输出属性 
     * @return 返回json字符串 *
     */
    public static <T> String toJson(T src, Inclusion inclusion) {
        if (src instanceof String) {
            return (String) src;
        } else {
            ObjectMapper customMapper = generateMapper(inclusion);
            try {
                return customMapper.writeValueAsString(src);
            } catch (IOException ex) {
                log.error("目标对象 " + src.getClass().getName() + " 转换 JSON 字符串时，发生异常！", ex);
            }
        }
        return null;
    }

    /**
     * * 将对象转换成json, 传入配置对象
     * * <pre> * {@link ObjectMapper ObjectMapper} mapper = new ObjectMapper(); 
     * mapper.setSerializationInclusion({@link Inclusion Inclusion.ALWAYS}); 
     * mapper.configure({@link Feature Feature.FAIL_ON_UNKNOWN_PROPERTIES}, false); 
     * mapper.configure({@link Feature Feature.FAIL_ON_NUMBERS_FOR_ENUMS}, true); 
     * mapper.setDateFormat(new {@link SimpleDateFormat SimpleDateFormat}("yyyy-MM-dd HH:mm:ss")); 
     * {@link JsonUtil JsonUtil}.toJson(user, mapper);
     * * </pre> * * {@link ObjectMapper ObjectMapper} * * @see ObjectMapper * *
     * @param <T>
     * @param src 对象 
     * @param mapper 配置对象
     * @return 返回json字符串 
     */
    public static <T> String toJson(T src, ObjectMapper mapper) {
        if (null != mapper) {
            if (src instanceof String) {
                return (String) src;
            } else {
                try {
                    return mapper.writeValueAsString(src);
                } catch (IOException ex) {
                    log.error("目标对象 " + src.getClass().getName() + " 转换 JSON 字符串时，发生异常！", ex);
                }
            }
        } else {
            return null;
        }
        return null;
    }

    /**
     * * 返回{@link ObjectMapper ObjectMapper}对象, 用于定制性的操作 * 
     * @return
     * {@link ObjectMapper ObjectMapper}对象
     */
    public static ObjectMapper mapper() {
        return MAPPER;
    }

    /**
     * * 通过Inclusion创建ObjectMapper对象 * * {@link Inclusion Inclusion 对象枚举} * <ul>
     * * <li>{@link Inclusion Inclusion.ALWAYS 全部列入}</li> *
     * <li>{@link Inclusion Inclusion.NON_DEFAULT 字段和对象默认值相同的时候不会列入}</li> *
     * <li>{@link Inclusion Inclusion.NON_EMPTY 字段为NULL或者""的时候不会列入}</li> *
     * <li>{@link Inclusion Inclusion.NON_NULL 字段为NULL时候不会列入}</li> * </ul> * *
     * @param inclusion 传入一个枚举值, 设置输出属性 
     * @return 返回ObjectMapper对象
     */
    private static ObjectMapper generateMapper(Inclusion inclusion) {
        ObjectMapper customMapper = new ObjectMapper(); // 设置输出时包含属性的风格 
        //customMapper.setSerializationInclusion(inclusion); // 设置输入时忽略在JSON字符串中存在但Java对象实际没有的属性 
        customMapper.configure(Feature.FAIL_ON_UNKNOWN_PROPERTIES, false); // 禁止使用int代表Enum的order()來反序列化Enum,非常危險 
        customMapper.configure(Feature.FAIL_ON_NUMBERS_FOR_ENUMS, true); // 所有日期格式都统一为以下样式 
        customMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")); 
        return customMapper; 
    } 
}
