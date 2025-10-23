package com.codepractice.store;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UserApiController {
    private List<String> users = new ArrayList<>((List.of("ann", "amm", "arr")));

    @GetMapping("/api/greet")
    public List<String> getUsers() {
        return users;
    }

    @PostMapping("api/greet")
    public List<String> addUsers(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        users.add(name);
        return users;
    }

    @DeleteMapping("api/greet")
    public List<String> deleteUser(@RequestBody Map<String, String> body) {
        String name = body.get("name");
        users.remove(name);
        return users;

    }

    @PutMapping("api/greet")
    public List<String> updateUser(@RequestBody Map<String, String> body) {
        String oldName  = body.get("oldName");
        String newName  = body . get("newName");

        int index = users.indexOf(oldName);
        if(index!=-1){
            users.set(index, newName);
        }
        return users;

    }
}
