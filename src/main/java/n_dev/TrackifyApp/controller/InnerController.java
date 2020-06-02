package n_dev.TrackifyApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class InnerController {
	
	
	@GetMapping("/displayGoals")
	public String displayGoals() {
		
		
		return "goals_list";
	}

}
