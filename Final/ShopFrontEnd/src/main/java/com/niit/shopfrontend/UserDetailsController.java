package com.niit.shopfrontend;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.backend.dao.UserDetailsDAO;
import com.backend.mode.UserDetails;

@Controller
public class UserDetailsController {
	@Autowired
	UserDetails userdetails;
	@Autowired(required=true)
	UserDetailsDAO userdetailsDAO;
	
	 @RequestMapping("/AddUser")
		public ModelAndView Adduserdetails()
		{
			
			ModelAndView mv = new ModelAndView("AddUser");
			mv.addObject("userdetails", new UserDetails());
			mv.addObject("Click Here for Registation",true);
			return mv;
		}
	

	 @RequestMapping("/UDetails")
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
			return new ModelAndView("redirect:UDetails");
		}
	 @RequestMapping("/saveUserDetails1")
		public ModelAndView addUser(@ModelAttribute("userdetails")UserDetails userdetails, BindingResult result) throws Exception
		{
			userdetailsDAO.save(userdetails);
			return new ModelAndView("redirect:PConfirm");
		}
	 @RequestMapping("edit_userdetails")
	 public ModelAndView editUserDetails(@RequestParam int id,@ModelAttribute("userdetails")UserDetails userdetails) {
		 ModelAndView mv = new ModelAndView("UserDetails");
			List<UserDetails> userdetailsList = userdetailsDAO.list();
			mv.addObject("userdetailsList", userdetailsList);
			UserDetails userdetailsEdit = userdetailsDAO.getRowById(id);
			mv.addObject("userdetailsEdit", userdetailsEdit);
			
			return mv;
		
	 }
	 
	 @RequestMapping("deleteUserdetails")
		public ModelAndView delete(@ModelAttribute("userdetails")UserDetails userdetails, BindingResult result)
		{
			userdetailsDAO.delete(userdetails);
			return new ModelAndView("redirect:UDetails");
		}

	

}
