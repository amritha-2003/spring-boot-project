package com.codepractice.store;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserList {
    @GetMapping("/username")
    public String username(Model model){
        List<String> names = List.of("abc","cde","efg");

        model.addAttribute("names",names);
        return "display";
    }
}
