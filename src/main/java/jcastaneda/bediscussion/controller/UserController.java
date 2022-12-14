package jcastaneda.bediscussion.controller;

import jcastaneda.bediscussion.model.UserRequest;
import jcastaneda.bediscussion.model.UserResponse;
import jcastaneda.bediscussion.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("")
    public List<UserResponse> getAllUser() {
        return userService.getAllUser();
    }

    @PutMapping("")
    public List<UserResponse> addUser(@RequestBody UserRequest userRequest) {
        return userService.addUser(userRequest);
    }

    @PostMapping("/{id}/{fullName}")
    public List<UserResponse> modifyUser(@PathVariable Integer id, @PathVariable String fullName) {
        return userService.modifyUser(id, fullName);
    }

    @DeleteMapping("/{id}")
    public List<UserResponse> deleteUser(@PathVariable Integer id) {
        return userService.deleteUser(id);
    }
}
