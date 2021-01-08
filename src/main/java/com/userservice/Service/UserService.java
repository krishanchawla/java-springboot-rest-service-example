package com.userservice.Service;

import com.userservice.pojo.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/* -----------------------------------------------------------------------
   - ** Java Springboot Rest Service Example Project **
   - Author: Krishan Chawla (krishanchawla1467@gmail.com)
   - Git Repo: https://github.com/krishanchawla/java-springboot-rest-service-example
   ----------------------------------------------------------------------- */
@Service
public class UserService {

    static List<User> users = new ArrayList<>(Arrays.asList(
            new User(UUID.randomUUID().toString(), "KRISHAN001", "Krishan", "Chawla", "krishanchawla1467@gmail.com", "ADMIN", 1),
            new User(UUID.randomUUID().toString(), "ADMIN001", "Application", "Administrator", "admin@krishanchawla.com", "ADMIN", 1),
            new User(UUID.randomUUID().toString(), "USER001", "Application", "User1", "user1@krishanchawla.com", "USER", 2),
            new User(UUID.randomUUID().toString(), "USER002", "Application", "User2", "user2@krishanchawla.com", "USER", 1),
            new User(UUID.randomUUID().toString(), "USER003", "Application", "User3", "user3@krishanchawla.com", "USER", 1)
    ));

    /**
     * Get All Users List
     *
     * @return users;
     */
    public List<User> getAllUsers() {
        return users;
    }

    /**
     * Get User Details based on the provided Id.
     *
     * @param userid
     * @return
     */
    public User getUserById(String userid) {
        return users.stream()
                .filter(e -> e.getUserid().equals(userid))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No such user found with user id: " + userid));
    }

    /**
     * Add a new User Profile
     *
     * @param user
     * @return
     */
    public User addUser(User user) {
        Boolean isExistingUser = users.stream()
                .map(User::getUserid)
                .anyMatch(user.getUserid()::equals);

        if (isExistingUser) {
            throw new IllegalArgumentException(user.getUserid() + " user id already exists");
        } else {
            user.setId(UUID.randomUUID().toString());
            users.add(user);
            return user;
        }
    }

    /**
     * Delete an existing User Profile
     *
     * @param userid
     * @return
     */
    public User deleteUser(String userid) {
        User existingUser = users.stream()
                .filter(user -> user.getUserid().equals(userid))
                .findFirst().get();

        if (existingUser != null) {
            users = users.stream()
                    .filter(user -> !user.getUserid().equals(userid))
                    .collect(Collectors.toList());
            return existingUser;
        } else {
            throw new IllegalArgumentException(userid + " user id does not exist");
        }
    }

    /**
     * Update an existing User Profile
     *
     * @param user
     * @return
     */
    public User updateUser(User user) {
        User existingUser = users.stream()
                .filter(e -> e.getUserid().equals(user.getUserid()))
                .findFirst().get();

        if (existingUser != null) {
            users = users.stream()
                    .filter(e -> !e.getUserid().equals(user.getUserid()))
                    .collect(Collectors.toList());
            users.add(user);
            return user;
        } else {
            throw new IllegalArgumentException(user.getUserid() + " user id does not exist");
        }
    }

}
