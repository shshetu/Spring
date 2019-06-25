package com.shetu.simple;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping(value = "/")
    public String displayIndex(){
        return "index";
    }

    @GetMapping(value = "/about")
    public String displayAbout(){
        return "about";
    }
}
