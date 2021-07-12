package roeuihyun.rest.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import roeuihyun.rest.entity.User;
import roeuihyun.rest.service.UserService;

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
//    @GetMapping("/users/{id}")
//    public User userId(@RequestParam String id){
//        //
//        return userService.find(id);
//    }


}
