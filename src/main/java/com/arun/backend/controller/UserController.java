package com.arun.backend.controller;

import com.arun.backend.dto.UserDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/search")
    String getUserInfo(@RequestParam String name, @RequestParam int age){
        return "Name: " + name + "age: " + age;
    }

    @GetMapping("/headers")
    String getRequestHeaders(@RequestHeader("User-Agent") String useragent, @RequestHeader("User-Location") String location){
        return useragent + location;
    }


    //if i want to extract multiple headers than we can use map..to store..
    @GetMapping("/headers/map")
    String getRequestHeadersUsingMap(@RequestHeader Map<String, String> pathVariable){
        return pathVariable.get("User-Agent") + pathVariable.get("User-Location");
    }

    @GetMapping("/headers/http-headers")
    String getRequestHeadersUsingHttpHeaders(@RequestHeader HttpHeaders requestHeaders){
        return requestHeaders.get("User-Agent") +" "+ requestHeaders.get("User-Location");
    }

    @PostMapping("/profile")
    String getUserProfile(@RequestBody UserDto userdto){
        return "Profile of user: " + userdto;
    }

    @PostMapping("/request-entity")
    public String createUserWithRequestEntity(RequestEntity<UserDto> requestEntity){
        UserDto userDto = requestEntity.getBody();
        HttpHeaders http_headers = requestEntity.getHeaders();
        String url = requestEntity.getUrl().getQuery();
        return "created user" + userDto.toString();
    }

}
