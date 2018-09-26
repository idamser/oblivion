package com.amser.raged.oblivion.controller;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/oblivion")
public class OblivionController {

	@RequestMapping("/helloworld")
    public String getUser() {
        return "hello world";
    }
	

}
