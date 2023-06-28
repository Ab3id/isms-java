package com.iaa.isms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IsmsController {
    @RequestMapping("/")
    public String helloWorld(){
        return "home";
    }
}
