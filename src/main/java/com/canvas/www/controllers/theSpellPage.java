package com.canvas.www.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class theSpellPage {

    @GetMapping("/getspells")
    public String egtspells(){
        return "spellpage";
    }
}
