package com.insta.project;

import com.insta.project.question.domain.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class MainController {

    @GetMapping("/login")
//    @ResponseBody
    public String loginForm(){
        return "login";
    }

    @GetMapping("/signup")
//    @ResponseBody
    public String signForm(){
        return "signup";
    }

    @GetMapping("/story")
//    @ResponseBody
    public String story(){
        return "story";
    }


    @GetMapping("/setprofile")
//    @ResponseBody
    public String setprofile(){
        return "setprofile";
    }

    @GetMapping("/")
//    @ResponseBody
    public String question(){
        return "redirect:question/list";
    }
}


