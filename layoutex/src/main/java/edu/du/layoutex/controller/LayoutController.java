package edu.du.layoutex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LayoutController {

    @GetMapping("/")
    public String pmain(){
        return "page/main";
    }

    @GetMapping("apage")
    public String apage(){ return "page/apage"; }

    @GetMapping("bpage")
    public String bpage(){ return "page/bpage"; }

    @GetMapping("cpage")
    public String cpage(){ return "page/cpage"; }

    @GetMapping("cone")
    public String conepage() {return "droppage/cone"; }

}
