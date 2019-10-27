package com.techprimers.cloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/server")
public class HelloResource {

    @GetMapping
    public String hello() {

        Student obj=new Student();
        obj.name="Test student";
        obj.age=22;
        obj.Class=12;
        return "Hello from server ";
    }
}
