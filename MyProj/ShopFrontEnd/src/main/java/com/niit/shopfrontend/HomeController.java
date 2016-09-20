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
	UserDetails userdetails;
	@Autowired
	UserDetailsDAO userdetailsDAO;
	@Autowired
	Category category;
	 @Autowired(required=true)
		CategoryDAO categoryDAO;
	 
	 @Autowired
	 Supplier supplier;
	 @Autowired(required=true)
	 SupplierDAO supplierDAO;
	
	@Autowired
	LoginService service = new LoginService();
 @Autowired(required=true)
	ProductDAO productDAO;
	public ProductDAO getProductDAO() {
		return productDAO;
	}
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	private String saveDirectory = "I:/Test/Upload/";
	 
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
	
	 @RequestMapping(value = "/Login1", method = RequestMethod.GET)
	    public String showLoginPage() {
	        return "Login1";
	    }
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
	@RequestMapping("/Product")
	public ModelAndView product()
	{
		System.out.println("This func for prodcut page");
		ModelAndView mv = new ModelAndView("Product");
		mv.addObject("product", new Product());
		mv.addObject("Click Here for Registation",true);
		List<Product> productList = productDAO.list();
		mv.addObject("productList", productList);
		return mv;
	}
	@RequestMapping("/saveProduct")
	public ModelAndView add(@ModelAttribute("product")Product product, BindingResult result, HttpServletRequest request, @RequestParam CommonsMultipartFile[] fileUpload) throws Exception
	{
		System.out.println("Hi I am Prodcut Backend Class");
		System.out.println(""+product.getId());
		productDAO.saveorupdate(product);
		/*HttpServletRequest request, @RequestParam CommonsMultipartFile[] fileUpload*/
		
		 
        System.out.println("description: " + request.getParameter("description"));
         
        if (fileUpload != null && fileUpload.length > 0) {
            for (CommonsMultipartFile aFile : fileUpload){
                 
                System.out.println("Saving file: " + aFile.getOriginalFilename());
                 
                if (!aFile.getOriginalFilename().equals("")) {
                    aFile.transferTo(new File(saveDirectory + aFile.getOriginalFilename()));
                }
            }
        }
		 
	   
		return new ModelAndView("redirect:Product");
	}
	
	@RequestMapping("/EditProduct1")
	public ModelAndView edit1(@RequestParam String id,
			   @ModelAttribute Product product) 
	{
		System.out.println("This func for register page");
		ModelAndView mv = new ModelAndView("EditProduct1");
		mv.addObject("Click Here for Registation",true);
		return mv;
	}
	
	@RequestMapping("/EditProduct")
	public String editProduct(@PathVariable("id") String id, Model model)
	{
		System.out.println("Hi I am Prodcut Backend Class");
		//System.out.println(""+product.getId());
		
		if(categoryDAO.get(id) !=null)
		{
			categoryDAO.saveorupdate(category);
			model.addAttribute("message", "updated successfully");
			return ("redirect:Product");
		}
		else
			model.addAttribute("errorMessage", "arg1");
			return ("redirect:Product");
		
		
		//return new ModelAndView("redirect:Product");
		
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
	
	@RequestMapping("/deleteProduct")
	public ModelAndView delete(@ModelAttribute("product")Product product, BindingResult result)
	{
		productDAO.delete(product);
		return new ModelAndView("redirect:Product");
	}

	@RequestMapping("/Register")
	public ModelAndView register()
	{
		System.out.println("This func for register page");
		ModelAndView mv = new ModelAndView("Register");
		mv.addObject("Click Here for Registation",true);
		return mv;
	}
	
	 @RequestMapping("edit_category")
	 public ModelAndView editCategory(@RequestParam String id,
	   @ModelAttribute Category category) {
		 ModelAndView mv = new ModelAndView("Category");
			List<Category> categoryList = categoryDAO.list();
			mv.addObject("categoryList", categoryList);
			Category categoryEdit = categoryDAO.getRowById(id);
			mv.addObject("categoryEdit", categoryEdit);
			
			return mv;
		
	 }
	 @RequestMapping("edit_product")
	 public ModelAndView editProduct(@RequestParam String id,
	   @ModelAttribute Product product) {
		 ModelAndView mv = new ModelAndView("Product");
			List<Product> productList = productDAO.list();
			mv.addObject("productList", productList);
			Product productEdit = productDAO.getRowById(id);
			mv.addObject("productEdit", productEdit);
			
			return mv;
		
	 }
	 
	 @RequestMapping("/Supplier")
		public ModelAndView supplier()
		{
			
			ModelAndView mv = new ModelAndView("Supplier");
			mv.addObject("supplier", new Supplier());
			mv.addObject("Click Here for Registation",true);
			List<Supplier> supplierList = supplierDAO.list();
			mv.addObject("supplierList", supplierList);
			return mv;
		}
		 
		@RequestMapping("/saveSupplier")
		public ModelAndView add(@ModelAttribute("supplier")Supplier supplier, BindingResult result) throws Exception
		{
			
			//System.out.println(""+product.getId());
			supplierDAO.save(supplier);
			
			 
	       // System.out.println("description: " + request.getParameter("description"));
	         
			 
		   
			return new ModelAndView("redirect:Supplier");
		}
	 
	 @RequestMapping("edit_supplier")
	 public ModelAndView editSupplier(@RequestParam String id,
	   @ModelAttribute Supplier supplier) {
		 ModelAndView mv = new ModelAndView("Supplier");
			List<Supplier> supplierList = supplierDAO.list();
			mv.addObject("supplierList", supplierList);
			Supplier supplierEdit = supplierDAO.getRowById(id);
			mv.addObject("supplierEdit", supplierEdit);
			
			return mv;
		
	 }
	 
	 @RequestMapping("/deleteSupplier")
		public ModelAndView delete(@ModelAttribute("supplier")Supplier supplier, BindingResult result)
		{
			supplierDAO.delete(supplier);
			return new ModelAndView("redirect:Supplier");
		}
	 
	 @RequestMapping("/UserDetails")
		public ModelAndView userdetails()
		{
			
			ModelAndView mv = new ModelAndView("UserDetails");
			mv.addObject("userdetails", new UserDetails());
			mv.addObject("Click Here for Registation",true);
			List<UserDetails> userdetailsList = userdetailsDAO.list();
			mv.addObject("userdetailsList", userdetailsList);
			return mv;
		}
	 
	 @RequestMapping("/saveUserDetails")
		public ModelAndView add(@ModelAttribute("userdetails")UserDetails userdetails, BindingResult result) throws Exception
		{
			userdetailsDAO.save(userdetails);
			return new ModelAndView("redirect:UserDetails");
		}
	 
	 @RequestMapping("edit_userdetails")
	 public ModelAndView editUserDetails(@RequestParam String id,
	   @ModelAttribute UserDetails userdetails) {
		 ModelAndView mv = new ModelAndView("UserDetails");
			List<UserDetails> userdetailsList = userdetailsDAO.list();
			mv.addObject("userdetailsList", userdetailsList);
			UserDetails userdetailsEdit = userdetailsDAO.getRowById(id);
			mv.addObject("userdetailsEdit", userdetailsEdit);
			
			return mv;
		
	 }
	 
	 @RequestMapping("/deleteUserdetails")
		public ModelAndView delete(@ModelAttribute("userdetails")UserDetails userdetails, BindingResult result)
		{
			userdetailsDAO.delete(userdetails);
			return new ModelAndView("redirect:UserDetails");
		}

	
}
