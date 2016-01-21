/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ct855.exception;

import java.lang.reflect.Method;
import org.springframework.aop.ThrowsAdvice;

/**
 *
 * @author RSN GROUP
 */
public class   ExceptionLog implements ThrowsAdvice{
    /** 
     * Owner  
     * 参数解释 Method method 执行的方法  
     * Object[] args 方法参数 
     *  Object target 代理的目标对象 
     * Throwable throwable 产生的异常  
     * Jan 18, 2010 3:21:46 PM 
     */  
    
    
    public void afterThrowing(Method method, Object[] args, Object target,  
            RuntimeException  throwable) {  
        System.out.println("产生异常的方法名称：  " + method.getName());  
          
        for(Object o:args){  
            System.out.println("方法的参数：   " + o.toString());  
        }  
          
        System.out.println("代理对象：   " + target.getClass().getName());  
        System.out.println("抛出的异常:    " + throwable.getMessage()+">>>>>>>"  
                + throwable.getCause());  
        System.out.println("异常详细信息：　　　"+throwable.fillInStackTrace());  
    }  
}
