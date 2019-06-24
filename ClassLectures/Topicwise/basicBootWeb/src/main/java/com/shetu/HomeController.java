package com.shetu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private StudentRepository repository;

    @GetMapping(value = "students")
    public String home(Model model) {
        return "home";
    }

    public String getStudentList(Model model) {
        List<Student> studentList = this.repositroy.findAll();
        model.addAttributes("slist", studentList);
        return "list";
    }


    @GetMapping(value = "students2")
    public ModelAndView displayStudents() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("studentlist", this.repository.findAll());
        modelAndView.setViewName("list2");
        return modelAndView;
    }

    @GetMapping(value = "students/{id}")
    public String getStudentById(Model model, @PathVariable("id") Long id) {
        Student s = this.repository.getOne(id);
        model.addAttribute("student", s);
        return "student";
    }

    @GetMapping(value = "/student")

    @GetMapping(value = "/about")
    public String aboutDisplay(Model model) {
        return "about";
    }
}