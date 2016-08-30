package com.niit.shopfrontend2;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import com.backend.dao.CategoryDAO;
import com.backend.dao.ProductDAO;
//import com.backend.mode.Category;
import com.backend.mode.Product;

@Controller
public class HomeController {
	@Autowired(required=true)
     ProductDAO productDAO;
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	public ProductDAO getProductDAO() {
		return productDAO;
	}
	/*CategoryDAO categoryDAO;
	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}
	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}*/
	@RequestMapping("/")
	public ModelAndView home()
	{
		System.out.println("This is controller");
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("Thank you for visiting this URL");
		return mv;
	}
	@RequestMapping("/Login")
	public ModelAndView login()
	{
		System.out.println("This is Login Page");
		
		ModelAndView mv = new ModelAndView("Login");
		mv.addObject("UserLickedLoginHere",true);
			return mv;
	}
	@RequestMapping("/Register")
	public ModelAndView register()
	{
		System.out.println("This func for register page");
		ModelAndView mv = new ModelAndView("Register");
		mv.addObject("Click Here for Registation",true);
		return mv;
	}
	@RequestMapping("/Product")
	public ModelAndView product()
	{
		System.out.println("This func for prodcut page");
		ModelAndView mv = new ModelAndView("Product");
		mv.addObject("product", new Product());
		mv.addObject("Click Here for Registation",true);
		return mv;
	}
	@RequestMapping("/saveProduct")
	public ModelAndView add(@ModelAttribute("product")Product product, BindingResult result)
	{
		System.out.println("Hi I am Prodcut Backend Class");
		System.out.println(""+product.getId());
		productDAO.saveorupdate(product);
		return new ModelAndView("Login");
	}
	//Category.jsp
	/*@RequestMapping("/Cat")
	public ModelAndView cat()
	{
		System.out.println("This func for prodcut page");
		ModelAndView mv = new ModelAndView("Cat");
		mv.addObject("categorypage", new Category());
		mv.addObject("Click Here for Registation",true);
		return mv;
	}
	@RequestMapping("/saveCategory")
	public ModelAndView catadd(@ModelAttribute("categorypage")Category obj, BindingResult result)
	{
		//System.out.println("Hi I am Category Backend Class");
		categoryDAO.save(obj);
		return new ModelAndView("Login");
	}*/
//Other method
	/*@RequestMapping(value = "/product", method = RequestMethod.GET)
	   public ModelAndView newpro() {
	      return new ModelAndView("product", "command", new Product());
	   }
	   
	   @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
	   public String addStudent(@ModelAttribute("SpringWeb")Product student, 
	   ModelMap model) {
	      model.addAttribute("name", student.getName());
	      model.addAttribute("description", student.getDescription());
	      model.addAttribute("id", student.getId());
	      
	      return "result";
	   }*/
	
	

}
