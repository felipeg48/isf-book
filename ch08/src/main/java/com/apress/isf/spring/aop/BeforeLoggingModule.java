/**
 * 
 */
package com.apress.isf.spring.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author Felipe Gutierrez
 *
 */
public class BeforeLoggingModule implements MethodBeforeAdvice {

	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		
	}

}
