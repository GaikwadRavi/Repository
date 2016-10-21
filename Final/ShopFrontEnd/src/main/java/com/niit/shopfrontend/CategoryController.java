package com.niit.shopfrontend;

import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.backend.dao.CategoryDAO;
import com.backend.mode.Category;
import com.backend.mode.Product;

@Controller
public class CategoryController {
	
	@Autowired
	Category category;
	 @Autowired(required=true)
		CategoryDAO categoryDAO;
	 @RequestMapping("/Category")
		public ModelAndView category()
		{
			System.out.println("This func for Category page");
			ModelAndView mv = new ModelAndView("Category");
			mv.addObject("category", new Category());
			mv.addObject("Click Here for Registation",true);
			List<Category> categoryList = categoryDAO.list();
			mv.addObject("categoryList", categoryList);
			return mv;
		}
		 
	 @RequestMapping("edit_category")
	 public ModelAndView editCategory(@RequestParam int categoryId,
	   @ModelAttribute Category category) {
		 ModelAndView mv = new ModelAndView("Category");
			List<Category> categoryList = categoryDAO.list();
			mv.addObject("categoryList", categoryList);
			Category categoryEdit = categoryDAO.getRowById(categoryId);
			mv.addObject("categoryEdit", categoryEdit);
			
			return mv;
		
	 }
	 
		@RequestMapping("/saveCategory")
		public ModelAndView add(@ModelAttribute("category")Category category, BindingResult result) throws Exception
		{
			System.out.println("Hi I am Category Backend Class");
			//System.out.println(""+product.getId());
			categoryDAO.saveorupdate(category);
			
			 
	       // System.out.println("description: " + request.getParameter("description"));
	         
			 
		   
			return new ModelAndView("redirect:Category");
		}
		@RequestMapping("/updateCategory")
		public ModelAndView update(@ModelAttribute("category")Category category, BindingResult result, HttpServletRequest request)
		{
			categoryDAO.update(category);
			return new ModelAndView("redirect:Category");
		}
		//It for Deleting the Category
		
		@RequestMapping("/deleteCategory")
		public ModelAndView delete(@ModelAttribute("category")Category category, BindingResult result)
		{
			categoryDAO.delete(category);
			return new ModelAndView("redirect:Category");
		}


}
