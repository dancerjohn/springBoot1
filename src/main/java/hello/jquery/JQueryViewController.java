package hello.jquery;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class JQueryViewController {

    @RequestMapping("/jquery")
    public String greeting(
    		Model model) {
    	

    	log.info("In jquery view controller");
        return "jquery1";
    }
}
