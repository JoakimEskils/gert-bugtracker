package com.gert.bugtracker.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {
    // Receive current status of game.
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "test";
    }

}
