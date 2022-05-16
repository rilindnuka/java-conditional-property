package com.rilind.javaconditionalproperty.controllers;

import com.rilind.javaconditionalproperty.services.MapService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapsController {
    private final MapService service;

    public MapsController(MapService service){
        this.service=service;
    }

    @GetMapping("/api/map")
    String getMap(){
        return service.getMap();
    }
}
