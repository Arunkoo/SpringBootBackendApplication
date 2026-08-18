package com.arun.backend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/legacy/version")
public class LegacyVersionController {

    //using a path versioning...
    @GetMapping({"", "/", "/v1"})
    public ResponseEntity<String> defaultPathVersion(){
        return ResponseEntity.ok("Response from default path version API 1.0.0");
    }

    @GetMapping("/v2")
    public ResponseEntity<String> pathV2Version(){
        return ResponseEntity.ok("Response from pathV2Version API 2.0.0");
    }

    //using a reqParams versioning...
    @GetMapping(params = "version=1")
    public ResponseEntity<String> defaultReqParamsVersion(){
        return ResponseEntity.ok("Response from default reqParams version API 1.0.0");
    }

    @GetMapping(params = "version=2")
    public ResponseEntity<String> reqParamsV2Version(){
        return ResponseEntity.ok("Response from reqParamsV2Version API 2.0.0");
    }
}
