package com.revature.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("viewController")
public class ViewControllerAlpha implements ViewController {

	@RequestMapping(value = {"/","/index"}, method = RequestMethod.GET)
	public String index() {
		return "index";
	}

}
