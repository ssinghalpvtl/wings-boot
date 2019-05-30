package com.example.wingsboot.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(value = "/hello/{input}", method = RequestMethod.GET)
    public @ResponseBody String getInput(@PathVariable("input") String input)  {
        return "Hello " + input;

    }
}
