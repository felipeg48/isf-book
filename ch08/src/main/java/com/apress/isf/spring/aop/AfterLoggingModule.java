/**
 * 
 */
package com.apress.isf.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author Felipe Gutierrez
 *
 */
public class AfterLoggingModule implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		
	}

}
