package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/User")
public class UserController {
	@RequestMapping("login")
	public String login(){
		return "recommand";
	} 
}
