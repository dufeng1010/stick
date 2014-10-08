package com.stick.controller.rest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/name")
public class LoginController {
	
	@RequestMapping(value = "{name}", method=RequestMethod.GET)
	public String getName(@PathVariable String name,
			ModelMap model) {
		model.addAttribute("name", name);
		return "rest/name";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {
 
		model.addAttribute("name", "this is default name");
		return "rest/name";
	}

}
