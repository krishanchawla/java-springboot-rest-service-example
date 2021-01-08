package com.userservice.Controllers;

import com.userservice.Service.UserService;
import com.userservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/* -----------------------------------------------------------------------
   - ** Java Springboot Rest Service Example Project **
   - Author: Krishan Chawla (krishanchawla1467@gmail.com)
   - Git Repo: https://github.com/krishanchawla/java-springboot-rest-service-example
   ----------------------------------------------------------------------- */
@RestController
@RequestMapping("/user-service/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{userid}")
    @ResponseBody
    public User getUserById(@PathVariable("userid") String userid) {
        return userService.getUserById(userid);
    }

    @PutMapping("/add")
    @ResponseBody
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/delete/{userid}")
    @ResponseBody
    public User deleteUser(@PathVariable("userid") String userid) {
        return userService.deleteUser(userid);
    }

    @PostMapping("/update")
    @ResponseBody
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

}
