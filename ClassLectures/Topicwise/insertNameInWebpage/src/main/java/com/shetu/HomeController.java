package com.shetu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping()
    public String home(Model model){
        model.addAttribute("student",new Student());
        return "home";
    }

    @PostMapping(Value="/")
    public String saveStudent(Model model,@Valid Student student){

    }
}


