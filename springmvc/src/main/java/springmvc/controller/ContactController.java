package springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springmvc.model.User;

@Controller
public class ContactController {
	
	// this will call first before any of the controller
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "WelCome to This Coding World");
		m.addAttribute("Desc", "Coding is everything");
	}

	@RequestMapping("/contact")
	public String showView(Model m) {
		System.out.println("this is contact url");
		return "contact";
	}

	// handle user inputs
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) 
	{
		System.out.println(user);		
		return "success";
	}

}
