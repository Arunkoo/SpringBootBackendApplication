package com.arun.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/legacy/version")
public class LegacyVersionController {
    @GetMapping({"", "/", "/v1"})
    public ResponseEntity<String> defaultPathVersion(){
        return ResponseEntity.ok("Response from default path version API 1.0.0");
    }

    @GetMapping("/v2")
    public ResponseEntity<String> pathV2Version(){
        return ResponseEntity.ok("Response from pathV2Version API 2.0.0");
    }
}
