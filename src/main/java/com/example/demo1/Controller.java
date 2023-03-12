package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    public String test()
    {
        return "<h1>Hello World!!!!</h1>";
    }

    @RequestMapping(value = "/test" , method = RequestMethod.POST)
    public String testNew()
    {
        return "<h1>Hello World!!!!</h1>";
    }
}
