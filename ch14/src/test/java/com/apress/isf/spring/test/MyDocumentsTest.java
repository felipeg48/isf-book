/**
 * 
 */
package com.apress.isf.spring.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Felipe Gutierrez
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:META-INF/spring/mydocuments-context.xml")
public class MyDocumentsTest {
	private static final Logger log = LoggerFactory.getLogger(MyDocumentsTest.class);
	
	
	@Test
	public void testGroovy(){
		log.debug("Testing Groovy...");
		assertNotNull("");
	}
	
	@Test
	public void testJRuby(){
		log.debug("Testing JRuby...");
	}
	
	@Test
	public void testBeanShell(){
		log.debug("Testing BeanShell...");
	}
	
}
