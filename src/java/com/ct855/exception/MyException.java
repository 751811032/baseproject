package com.ct855.exception;

/**
 *
 * 自定义异常
 */
public class MyException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     *
     * 带自定义错误信息的输出
     *
     * @param message
     *
     */
    public MyException(String message) {

        super(message);

    }

    /**
     *
     * 自定义错误信息和异常抛出
     *
     * @param message
     *
     * @param cause
     *
     */
    public MyException(String message, Throwable cause) {

        super(message, cause);

    }

    /**
     *
     * 只有异常抛出
     *
     * @param cause
     *
     */
    public MyException(Throwable cause) {

        super(cause);

    }

}
