package com.niit.shopfrontend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.backend.dao.SupplierDAO;
import com.backend.mode.Supplier;

@Controller
public class SupplierController {
	 @Autowired
	 Supplier supplier;
	 @Autowired(required=true)
	 SupplierDAO supplierDAO;
	 
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
			supplierDAO.save(supplier);
		
			return new ModelAndView("redirect:Supplier");
		}
	 
	 @RequestMapping("edit_supplier")
	 public ModelAndView editSupplier(@RequestParam int supplierId,
	   @ModelAttribute Supplier supplier) {
		 ModelAndView mv = new ModelAndView("Supplier");
			List<Supplier> supplierList = supplierDAO.list();
			mv.addObject("supplierList", supplierList);
			Supplier supplierEdit = supplierDAO.getRowById(supplierId);
			mv.addObject("supplierEdit", supplierEdit);
			
			return mv;
		
	 }
	 
	 @RequestMapping("/deleteSupplier")
		public ModelAndView delete(@ModelAttribute("supplier")Supplier supplier, BindingResult result)
		{
			supplierDAO.delete(supplier);
			return new ModelAndView("redirect:Supplier");
		}
	 

}
