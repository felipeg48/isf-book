/**
 * 
 */
package com.apress.isf.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertNotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.apress.isf.spring.social.DocumentTweet;

/**
 * @author Felipe Gutierrez
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:META-INF/spring/mydocuments-context.xml","classpath:META-INF/spring/mydocuments-mongo-context.xml"})
public class MyDocumentsTest {
	private static final Logger log = LoggerFactory.getLogger(MyDocumentsTest.class);
	
	@Autowired
	DocumentTweet documentTweet;
	
	@Test
	public void testTwitter(){
		log.debug("Testing Spring Social....");
		assertNotNull(documentTweet);
		documentTweet.tweet("Playing with Spring Social!");
	}
}
