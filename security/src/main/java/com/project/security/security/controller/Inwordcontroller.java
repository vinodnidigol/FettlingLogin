package com.project.security.security.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.security.security.pojo.Inword;
import com.project.security.security.repository.Inwordresporitory;

@Controller
public class Inwordcontroller {
	
	@Autowired(required=true)
	private Inwordresporitory inwordresporitory ;

	@GetMapping("/inword")
	public ModelAndView inword(HttpServletRequest req , HttpServletResponse res){    
		  ModelAndView m1 = new ModelAndView("inword") ;
		  List<Inword> getall = inwordresporitory.findAll() ;
		  m1.addObject("inword", new Inword());
		  m1.addObject("getall", getall) ;
		  return m1 ;
		  }
	
	@PostMapping("/getinwords")
	@ResponseBody
	public String add( Inword getinwords) {
		inwordresporitory.save(getinwords);
		return "redirect/inword";
	}
}
