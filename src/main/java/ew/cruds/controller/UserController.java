package ew.cruds.controller;

import ew.cruds.model.User;
import ew.cruds.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        List<User>result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public User findAll(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @Transactional
    @PostMapping
    public User insert(@RequestBody User user) {
        return repository.save(user);

    }}

