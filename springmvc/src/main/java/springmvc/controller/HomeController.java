package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) 
	{
		System.out.println("this is home url");
		// add data
		model.addAttribute("name", "Sahil Sartaj");
		// add collection data
		List<String> friends = new ArrayList<String>();
		friends.add("Nasira");
		friends.add("Hamida");
		friends.add("Imran");
		friends.add("Ashif");
		model.addAttribute("f", friends);
		
		return "index";
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		System.out.println("this is about section");
		// creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		// setting the data
		modelAndView.addObject("about", "Software Engineer");
		// setting the view name
		modelAndView.setViewName("about");
		return modelAndView;
	}

}
