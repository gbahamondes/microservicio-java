package com.example.testingweb;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	public @ResponseBody String greeting() {
		return "Hello, I'm Giovanni Bahamondes!!";
	}

}
