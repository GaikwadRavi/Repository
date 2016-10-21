package com.niit.shopfrontend;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.backend.dao.CategoryDAO;
//import com.backend.dao.CategoryDAO;
import com.backend.dao.ProductDAO;
import com.backend.dao.SupplierDAO;
import com.backend.dao.UserDetailsDAO;
import com.backend.mode.Category;
import com.backend.mode.Product;
import com.backend.mode.Supplier;
import com.backend.mode.UserDetails;






@Controller
public class HomeController {
	
	
	
	@Autowired
	Category category;
	 @Autowired(required=true)
		CategoryDAO categoryDAO;
	
	 
	
	
	@Autowired
	LoginService service = new LoginService();
 
	
	
	 
	@RequestMapping("/")
	public ModelAndView home(HttpSession session)
	{
		System.out.println("This is controller");
		ModelAndView mv = new ModelAndView("/Home");
		session.setAttribute("category", category);
		session.setAttribute("categoryList", categoryDAO.list());
		mv.addObject("Thank you for visiting this URL");
		return mv;
	}
	@RequestMapping("Home")
	public ModelAndView Home(HttpSession session)
	{
		System.out.println("This is controller");
		ModelAndView mv = new ModelAndView("/Home");
		session.setAttribute("category", category);
		session.setAttribute("categoryList", categoryDAO.list());
		mv.addObject("Thank you for visiting this URL");
		return mv;
	}
	
	 @RequestMapping(value = "/Login1", method = RequestMethod.GET)
	    public String showLoginPage() {
	        return "Login1";
	    }
		
	 
	 
	 @RequestMapping("/Niit")
		public ModelAndView niit()
		{
			System.out.println("This is About US Page");
			ModelAndView mv = new ModelAndView("NiitDeccan");
			mv.addObject("UserLickedLoginHere",true);
				return mv;
		}
	 
	 
	@RequestMapping("/Login")
	public ModelAndView login()
	{
		System.out.println("This is Login Page");
		ModelAndView mv = new ModelAndView("Login3");
		mv.addObject("UserLickedLoginHere",true);
			return mv;
	}
	
	

	
	
	
	
	
	/* @RequestMapping(method = RequestMethod.POST)
	    public String handleFileUpload(HttpServletRequest request,
	            @RequestParam CommonsMultipartFile[] fileUpload) throws Exception {
	         
	        System.out.println("description: " + request.getParameter("description"));
	         
	        if (fileUpload != null && fileUpload.length > 0) {
	            for (CommonsMultipartFile aFile : fileUpload){
	                 
	                System.out.println("Saving file: " + aFile.getOriginalFilename());
	                 
	                if (!aFile.getOriginalFilename().equals("")) {
	                    aFile.transferTo(new File(saveDirectory + aFile.getOriginalFilename()));
	                }
	            }
	        }
	        return "Result";
	 }
	 */
	
	

	@RequestMapping("/Register")
	public ModelAndView register()
	{
		System.out.println("This func for register page");
		ModelAndView mv = new ModelAndView("Register");
		mv.addObject("Click Here for Registation",true);
		return mv;
	}
	
	
	 
	 
	
}
