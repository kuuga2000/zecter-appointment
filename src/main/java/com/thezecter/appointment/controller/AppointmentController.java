package com.thezecter.appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.util.Map.entry;

@RestController
@RequestMapping("v1")
public class AppointmentController {

    private Environment environment;

    public AppointmentController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("list")
    public Map<String, String> doctorList() {
        return Map.ofEntries(
                entry("success", "200"),
                entry("data", "The appointment list"),
                entry("port", environment.getProperty("local.server.port"))
        );
    }

}