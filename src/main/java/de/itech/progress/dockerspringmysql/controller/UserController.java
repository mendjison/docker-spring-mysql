package de.itech.progress.dockerspringmysql.controller;

import de.itech.progress.dockerspringmysql.dao.UserDao;
import de.itech.progress.dockerspringmysql.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/users")
public class UserController {
    
    private UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @PostMapping
    private ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity
                .accepted()
                .body(userDao.save(user));
    }

    @PutMapping
    private ResponseEntity<User> updateUser(@RequestBody User user) {
        return ResponseEntity
                .accepted()
                .body(userDao.save(user));
    }

    @DeleteMapping("/{userId}")
    private ResponseEntity<Boolean> deleteUser(@PathVariable(value = "userId") String userId)  {
        userDao.deleteById(userId);
        return ResponseEntity
                .accepted()
                .body(true);
    }

    @GetMapping("/{userId}")
    private ResponseEntity<User> findUser(@PathVariable(value = "userId") String userId)  {
        return ResponseEntity
                .accepted()
                .body(userDao.findById(userId).orElse(null));
    }

    @GetMapping
    private ResponseEntity<List<User>> findUsers()  {
        return ResponseEntity
                .accepted()
                .body(userDao.findAll());
    }


}
