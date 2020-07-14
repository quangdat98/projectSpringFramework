package example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/index")
    public String index(Model m){
        m.addAttribute("mess","hello");
        return "home";
    }
}
