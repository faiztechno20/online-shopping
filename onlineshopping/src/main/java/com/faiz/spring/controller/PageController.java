package com.faiz.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.faiz.spring.shoppingbackends.dao.CategoryDAO;
import com.faiz.spring.shoppingbackends.dto.Category;



// cntr+shift+o to import all annotation
@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO ;

	  @RequestMapping(value={"/","/home"})
	public ModelAndView index()
	{
		  ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		mv.addObject("userClickHome",true);
		mv.addObject("categories",categoryDAO.list());
		
		return mv;
	}
	  

	  @RequestMapping(value="/about")
	public ModelAndView about()
	{
		  ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	  

	  @RequestMapping(value="/contact")
	public ModelAndView contact()
	{
		  ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact");
		mv.addObject("userClickContact",true);
		return mv;
	}
	  
	  // methods to load aa the prodcts and based on category:
	  
	  @RequestMapping(value="show/all/products")
		public ModelAndView showAllProdcts()
		{
			  ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","All Products");
			mv.addObject("userClickAllProducts",true);
			mv.addObject("categories",categoryDAO.list());
			
			return mv;
		}
	  
	  
	  @RequestMapping(value="show/category/{id}/prodcts")
		public ModelAndView showCategoryProdcts(@PathVariable("id") int id)
		{
		  
		  
			  ModelAndView mv = new ModelAndView("page");
			  
			  //categoryDAO to fetch a single category
			  
			  Category category=null;
			  category=categoryDAO.get(id);
			  mv.addObject("title",category.getName());
			  //passing the list of categories
			  mv.addObject("categories",categoryDAO.list());
			  //passing the single category object
			  mv.addObject("category",category);
			
			mv.addObject("userClickCategoryProducts",true);
			
			
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
			  ModelAndView mv = new ModelAndView("page2");
			mv.addObject("greeting",greetings);
			return mv;
		}
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
