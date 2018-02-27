package edu.ifiguer.cypher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {
	
	@Autowired
	Encipherer encipherer;

	@RequestMapping("/output")
	public String output(@RequestParam(value="message") String message, Model model) {
		message = encipherer.rot13(message);
		model.addAttribute("message", message);
		return "output";
	}
}
