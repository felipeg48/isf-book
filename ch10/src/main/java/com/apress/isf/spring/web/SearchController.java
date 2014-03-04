/**
 * 
 */
package com.apress.isf.spring.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apress.isf.java.model.Document;
import com.apress.isf.spring.data.DocumentDAO;

/**
 * @author Felipe Gutierrez
 *
 */
@Controller
@RequestMapping("/search")
public class SearchController {
	
	@Autowired
	DocumentDAO documentDAO;

	@RequestMapping(value="/all",method=RequestMethod.GET)
	public String searchAll(Model model){
		List<Document> docs = documentDAO.getAll();
		model.addAttribute("docs", docs);
		System.out.println("@@@@: " + docs.size());
		return "search/all";
	}
}
