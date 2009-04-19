package example.controllers.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name, Model model) {
		model.addAttribute("name", name);
		return "hello/hello";
	}
}
