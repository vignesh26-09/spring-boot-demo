package com.example.demo.controller;
import com.example.demo.service.UserService.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.example.demo.entity.User;
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;
    @PostMapping("/users")
    public String createStudent(@RequestBody User user){
        userService.createUser(user);
        return "User Created";
    }
    @GetMapping("/users/{id}")
    public User getStudent(@PathVariable Long id){
          return userService.getStudent(id);
    }

    @DeleteMapping("/users/{id}")
    public String deleteStudent(@PathVariable Long id){
         userService.deleteStudent(id);
         return "Student deleted";
    }
}
