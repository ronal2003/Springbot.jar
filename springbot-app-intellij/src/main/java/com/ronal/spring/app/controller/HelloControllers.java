package com.ronal.spring.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloControllers {
    @GetMapping("/api/user")
    public Map<String, String> user() {

        Map<String, String> json = new HashMap<>();
        json.put("messaje", "La madre que si funciona me muero de la felicidad");
        return json;
    }
}
