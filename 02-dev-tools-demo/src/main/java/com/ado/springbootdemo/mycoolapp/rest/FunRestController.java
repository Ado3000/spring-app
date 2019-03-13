package com.ado.springbootdemo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    //Property injection
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose a "/" that returns Hello World

    @GetMapping("/")
    public String sayHello(){
        return "Hello World" + LocalDateTime.now();
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is you lucky day";
    }

    @GetMapping("/saban")
    public String getSaban(){
        return "Saban";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach name:" + " " + coachName + "coaches team" + " " + teamName;
    }

}

