package com.prasanna.web_initializer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Introduction {
    @RequestMapping("/firstpage")

    public String getIntroduction(){
       return "This is my first Web Page";

    }
    @RequestMapping("/secondpage")
    public String Secondpage(){
        return"This is my second page";
    }
}
