package com.fullstackrobert.fullstack.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.fullstackrobert.fullstack.repository.UserRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.fullstackrobert.fullstack.model.User;

/*** Robert Henderson Code with Arjun Implementation */
@RestController
public class UserController {
    
@Autowired
private UserRepository userRepository;

@PostMapping("/user")
User newUser(@RequestBody User newUser){

    return userRepository.save(newUser);

}



}
