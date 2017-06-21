package com.faiz.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
// cntr+shift+o to import all annotation
@Controller
public class PageController {

	  @RequestMapping(value={"/","/home"})
	public ModelAndView index()
	{
		  ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","welcome to spring mvc");
		return mv;
	}
	  
	  
//	  @RequestMapping(value="/test")
//	  public ModelAndView test(@RequestParam(value="greetings", required=false) String greetings)
//		{
//		  if(greetings==null)
//		  {
//			  greetings="hello there";
//		  }
//			  ModelAndView mv = new ModelAndView("page");
//			mv.addObject("greeting",greetings);
//			return mv;
//		}
//	  
	  
	  // we use path variable to provide dynamic strings in path and get rid of ? in url
	  @RequestMapping(value="/test/{greetings}")
	  public ModelAndView test(@PathVariable("greetings") String greetings)
		{
		  if(greetings==null)
		  {
			  greetings="hello there";
		  }
			  ModelAndView mv = new ModelAndView("page");
			mv.addObject("greeting",greetings);
			return mv;
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
