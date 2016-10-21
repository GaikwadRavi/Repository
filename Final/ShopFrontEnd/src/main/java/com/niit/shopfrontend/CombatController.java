package com.niit.shopfrontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class CombatController {
 
	@RequestMapping("homeflow")
	public String home(){
		return "index";
	}
}