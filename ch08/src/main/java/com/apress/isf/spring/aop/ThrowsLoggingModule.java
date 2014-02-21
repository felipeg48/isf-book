/**
 * 
 */
package com.apress.isf.spring.aop;

import org.springframework.aop.ThrowsAdvice;

/**
 * @author Felipe Gutierrez
 *
 */
public class ThrowsLoggingModule implements ThrowsAdvice {

	public void afterThrowing(IllegalArgumentException e) throws Throwable {
		
	}
}
