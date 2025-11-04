package com.patricia.spring_app.controller;

import com.patricia.spring_app.domain.User;
import com.patricia.spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    //public HelloWorldController(HelloWorldService helloWorldService){
    //   this.helloWorldService = helloWorldService;
    //}

    //@Autowired
    //private SDKAWS sdkaws;

    // post, get, delete, put, patch, options, head
    // GET /hello-world
    @GetMapping
    public String helloWorld(){
       //return "Hello World";
        return helloWorldService.helloWorld("Patricia");
    }

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable String id,  @RequestParam(value = "Filter", defaultValue ="nenhum") String filter,@RequestBody User body){
        return "Hello Post " + body.getName() + " " + id;
    }
}
