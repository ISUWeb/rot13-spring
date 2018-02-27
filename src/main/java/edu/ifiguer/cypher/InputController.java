package edu.ifiguer.cypher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InputController {

	@RequestMapping("/")
	public String input() {
		return "input";
	}
}
