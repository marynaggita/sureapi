package com.example.sure.controllers;

import com.example.sure.models.nameRequest;
import com.example.sure.services.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class nameController {


    @GetMapping("/nameInfo")
    public String name() {
        return "Hello";
    }


    @Autowired
    NameService nameService;

    @PostMapping("/nameInfo1")
    @ResponseBody
    public nameRequest person(@RequestBody nameController controller) {
        return nameService.person();
    }



}
