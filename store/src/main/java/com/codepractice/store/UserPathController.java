package com.codepractice.store;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserPathController {
    private List<String> users = new ArrayList<>(List.of("ann", "amm", "arr"));

    @DeleteMapping("api/greet/{name}")
    public List<String> deleteUser(@PathVariable String name) {
        users.remove(name);
    return users;
    }

    @GetMapping("api/greet/{name}")
    public String getUserByName(@PathVariable String name) {
        if (users.contains(name)) {
            return name;  // user found
        } else {
            return "User not found"; // user not found
        }
    }

    // Add a new user using path variable
    @PostMapping("/api/greet/{name}")
    public String addUser(@PathVariable String name) {
        users.add(name);
        return name + " added successfully";
    }


    // Update user using path variable for old name
    @PutMapping("/api/greet/{oldName}/{newName}")
    public String updateUser(@PathVariable String oldName, @PathVariable String newName) {
        int index = users.indexOf(oldName);
        if (index != -1) {
            users.set(index, newName);
            return oldName + " updated to " + newName;
        } else {
            return "User not found";
        }
    }


}
