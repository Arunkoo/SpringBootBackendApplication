package com.arun.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/version/{v}")
public class VersionController {
    @GetMapping(version = "1.0")
    public ResponseEntity<String> defaultVersioning(){
     return ResponseEntity.ok().body("Response by default version 1.0.0");
    }

    @GetMapping(version = "2.0")
    public ResponseEntity<String> Versioning2(){
        return ResponseEntity.ok().body("Response by  version 2.0.0");
    }
}
