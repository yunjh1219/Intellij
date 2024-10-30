package edu.du.layoutex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {

    @GetMapping("/")
    public String main(){
        return "page/main";
    }

 

}
