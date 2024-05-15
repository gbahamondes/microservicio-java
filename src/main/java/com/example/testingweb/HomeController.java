package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping(path = "/home", method = {RequestMethod.GET, RequestMethod.POST})
	public @ResponseBody String greeting() {
		return "Hello, I'm Giovanni Bahamondes!!";
	}

}
