package com.niit.shopfrontend;

import java.io.File;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.backend.dao.CategoryDAO;
import com.backend.dao.ProductDAO;
import com.backend.dao.SupplierDAO;
import com.backend.mode.Category;
import com.backend.mode.Product;
import com.backend.mode.Supplier;

@Controller
public class ProductController {
	private String saveDirectory = "I:/Test/Upload/";
	@Autowired(required=true)
	SupplierDAO supplierDAO;
	@Autowired(required=true)
	CategoryDAO categoryDAO;
	@Autowired(required=true)
	ProductDAO productDAO;
	public ProductDAO getProductDAO() {
		return productDAO;
	}
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	
	@RequestMapping("/Product")
	public ModelAndView product()
	{
		
		ModelAndView mv = new ModelAndView("Product");
		mv.addObject("product", new Product());
		mv.addObject("Click Here for Registation",true);
		List<Product> productList = productDAO.list();
		List<Category> categoryList = categoryDAO.list();
		mv.addObject("categoryList", categoryList);
		List<Supplier> supplierList = supplierDAO.list();
		mv.addObject("supplierList", supplierList);
		mv.addObject("productList", productList);
		return mv;
	}
	@RequestMapping("/saveProduct")
	public ModelAndView add(@ModelAttribute("product")Product product, BindingResult result, HttpServletRequest request, @RequestParam CommonsMultipartFile[] fileUpload) throws Exception
	{
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
	
	
	@RequestMapping("/deleteProduct")
	public ModelAndView delete(@ModelAttribute("product")Product product, BindingResult result)
	{
		productDAO.delete(product);
		return new ModelAndView("redirect:Product");
	}
	
	@RequestMapping("edit_product")
	 public ModelAndView editProduct(@RequestParam int id,
	   @ModelAttribute Product product) {
		 ModelAndView mv = new ModelAndView("Product");
			List<Product> productList = productDAO.list();
			mv.addObject("productList", productList);
			List<Category> categoryList = categoryDAO.list();
			mv.addObject("categoryList", categoryList);
			List<Supplier> supplierList = supplierDAO.list();
			mv.addObject("supplierList", supplierList);
			Product productEdit = productDAO.getRowById(id);
			mv.addObject("productEdit", productEdit);
			
			return mv;
		
	 }
	

	@RequestMapping("edit_product1")
	 public ModelAndView ProductBook(@RequestParam int id,
	   @ModelAttribute Product product) {
		 ModelAndView mv = new ModelAndView("Book");
			List<Product> productList = productDAO.list();
			mv.addObject("productList", productList);
			Product productEdit = productDAO.getRowById(id);
			mv.addObject("productEdit", productEdit);
			
			return mv;
		
	 }
	
	@RequestMapping("/PList")
	public ModelAndView plist()
	{
		System.out.println("This func for register page");
		ModelAndView mv = new ModelAndView("ProductList");
		mv.addObject("product", new Product());
		mv.addObject("Click Here for Registation",true);
		List<Product> productList = productDAO.list();
		mv.addObject("productList", productList);
		return mv;
	}
	
	@RequestMapping("/PConfirm")
	public ModelAndView productConfirm()
	{
		System.out.println("This func for prodcut page");
		ModelAndView mv = new ModelAndView("BookConfirm");
		mv.addObject("Click Here for Registation",true);
		return mv;
	}

}
