package com.univesp.barbearia.pi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/schedule")
public class SchedulerController {

    private Logger logger = LoggerFactory.getLogger(SchedulerController.class);

    @GetMapping(path="/today")
    public String todayScheduled(){
        return  "list schedule today";
    }

    @PostMapping(value="/register", produces = {"application/json"})
    public String registerSevice(){
        return  "register";
    }

    @DeleteMapping(path = "/delete")
    public String deleteScheduled(){
        return "excluded";
    }

}
