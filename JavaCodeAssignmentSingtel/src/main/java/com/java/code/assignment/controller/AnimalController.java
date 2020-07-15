package com.java.code.assignment.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.code.assignment.entity.Animal;
import com.java.code.assignment.eone.Bird;

@Controller
public class AnimalController {
    @RequestMapping(method = RequestMethod.GET, value = "/animal/getAnimalsCount")
    @ResponseBody
    public int getFlyingAnimalCount(@RequestBody Animal[] animals) {
    	Bird bird = new Bird();
        int flyingAnimal = bird.getFlyAnimalCount();
        return flyingAnimal;
    }
}
