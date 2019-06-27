package com.shetu.simple;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/user/") //This is my desire or accord
public class UserController {
@GetMapping(value = "/list")
    public String getList(Model model){
    List<User> list = new ArrayList<>();
    //User(Long id, String name, String userName, String password, String gender, String country)
    list.add(new User((long) 11,"Shetu","d","defds","Male","BD"));
    list.add(new User((long) 11,"Shetu","d","defds","Male","BD"));

    return "users/list";
}

@GetMapping(value = "/add")
    public String add(){
    return "users/add";
}

@GetMapping(value = "/edit/{id}")
    public String edit(@PathVariable Long id){
    return "redirect:/user/list";
}
}

