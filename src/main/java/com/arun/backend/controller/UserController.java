package com.arun.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
public class UserController {
    @GetMapping("/api/user/{userId}/post/{postId}")
    String SearchUserPostWithMultiPathValue(@PathVariable Map<String, String> pathVariableMap){
        return "Fetched user with id " + pathVariableMap.get("userId") + "post with postId " + pathVariableMap.get("postId");
    }
}
