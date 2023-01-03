package com.patrickfurbert.stuffandthings.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    /*
     * For AWS elastic beanstalk, the root route "/" needs to
     * return a 200 OK status code to avoid errors
     */
    @GetMapping(value="/")
    @ResponseStatus(HttpStatus.OK)
    public void rootRoute(){}

}
