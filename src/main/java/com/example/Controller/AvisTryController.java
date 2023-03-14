package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AvisTryController {
    @GetMapping()
    public String AvisTryController(){
        return "AvisController";
    }
}
