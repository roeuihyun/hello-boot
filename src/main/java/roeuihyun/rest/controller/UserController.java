package roeuihyun.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import roeuihyun.rest.entity.User;
import roeuihyun.rest.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    //
    private final UserService userService;

    @PostMapping("/users")
    public String register(@RequestBody User newUser){
        //
        return userService.register(newUser);
    }

    @GetMapping("/users/{id}")
    public User find(@PathVariable String id){
        //
        return userService.find(id);
    }

    @GetMapping("/users")
    public List<User> findAll(){
        return userService.findAll();
    }

}
