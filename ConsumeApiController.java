package com.anand.resttemplete;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Api")

public class ConsumeApiController {

	@GetMapping public String get(Model model)
	{

		
		RestTemplateProvider restTemplate
			= new RestTemplateProvider();

		model.addAttribute("user",
						restTemplate.getUserData());
		model.addAttribute("model", new UserData());
		return "GetData";
	}

	@PostMapping
	public String post(@ModelAttribute("model")
					UserData user, Model model)
	{

		RestTemplateProvider restTemplate = new RestTemplateProvider();

		ResponseEntity<UserData> response = restTemplate.post(user);
		
	    UserData savedData = response.getBody();

	    model.addAttribute("user", savedData);
	    model.addAttribute("headers", response.getHeaders() + " " + response.getStatusCode());
		return "GetData";
	}
}
