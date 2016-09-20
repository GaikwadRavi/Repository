/*package com.niit.shopfrontend;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.backend.dao.CategoryDAO;
import com.backend.mode.Category;

public class CategoryController {
	
	 @RequestMapping("/Category")
		public ModelAndView category()
		{
			System.out.println("This is About US Page");
			ModelAndView mv = new ModelAndView("Category");
			mv.addObject("UserLickedLoginHere",true);
				return mv;
		}
	private @Autowired(required=true)
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
	 
	@RequestMapping("/saveCategory")
	public ModelAndView add(@ModelAttribute("category")Category category, BindingResult result,
			HttpServletRequest request, @RequestParam CommonsMultipartFile[] fileUpload) throws Exception
	{
		System.out.println("Hi I am Category Backend Class");
		//System.out.println(""+product.getId());
		categoryDAO.save(category);
		
		 
        System.out.println("description: " + request.getParameter("description"));
         
		 
	   
		return new ModelAndView("redirect:Product");
	}

}
*/