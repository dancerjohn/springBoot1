package hello.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class GreetingViewController {

    @RequestMapping("/greetingView")
    public String greeting(
    		@RequestParam(value="name", required=false, defaultValue="World") String name, 
    		Model model) {
    	
    	log.info("In greeting view controller");
        model.addAttribute("name", name);
        return "greeting";
    }
}
