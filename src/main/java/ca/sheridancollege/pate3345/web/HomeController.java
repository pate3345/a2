package ca.sheridancollege.pate3345.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

//	Extra Feature - User can search Author, Title or Desc from Search bar.
	
	@GetMapping("/")
	public String index() {
		return "index.html";
	}
}
