package ch.gg.andy.springbootexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.HttpMethodConstraint;

@RestController
public class SimpleController {

    @RequestMapping("/simple")
    public String makeSimpleGet() {
        return "Simple as that.";
    }

}
