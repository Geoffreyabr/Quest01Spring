package com.Quest1.Quest1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String william() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String david() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String jodie() {
        return "Jodie Whittaker";
    }

}
