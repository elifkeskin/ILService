package com.ILService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class denemeController {


    @GetMapping("/data")
    public String data(){

        return "wqewqewq";
    }
}
