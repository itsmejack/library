package com.library;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StartController {


    @GetMapping(path = "/home")
    public String home() {
        return "homePage";
    }
}
