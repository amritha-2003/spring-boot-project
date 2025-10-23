package com.codepractice.store;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class User {
    @GetMapping("/greet")
    public String greet(Model model){
        model.addAttribute("name","amritha");
        return "greeting" ;
    }
}
