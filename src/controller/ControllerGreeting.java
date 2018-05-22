package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerGreeting {
    @GetMapping("/greeting")
    public String greeting(){
        return "index";
    }
}
