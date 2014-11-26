package basic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FrontController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public void greeting(@RequestParam(required=false, value="name", defaultValue="World") String name, Model model){
		model.addAttribute("name", name);
	}
}
