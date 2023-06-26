package com.il.demo;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class User {
    @Id
    private String id;

    private String username;

    // TODO: make o2m relationship to posts model
    // private int postIDs;

    private static List<User> users = Arrays.asList(
            new User("u1", "joe"),
            new User("u2", "moe"),
            new User("u3", "koe"));

    public static User getById(String id) {
        
        User obj = users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
        System.out.println("obj " + obj);
        return obj;
    }

}