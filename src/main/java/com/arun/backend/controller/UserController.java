package com.arun.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping("/{userId}/post/{postId}")
    String SearchUserPostWithMultiPathValue(@PathVariable Map<String, String> pathVariableMap){
        return "Fetched user with id " + pathVariableMap.get("userId") + "post with postId " + pathVariableMap.get("postId");
    }

    @GetMapping("/{userId}/post/{postId}/comment/{commentId}")
    List<String> getCommentOfPost(@PathVariable Map<String, String> pathVariables){
        ArrayList<String> comment = new ArrayList<>();
        comment.add("Hye! how are you?");
        comment.add("Too much stuff");
        comment.add("I don't known");
        comment.add("let join the part");

        return comment;
    }
}
