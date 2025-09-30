package com.APSproject.demo.controllers;

import com.APSproject.demo.model.Usuario;
import com.APSproject.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/login")
public class UserController {

    @Autowired
    UserRepository userRepository;

    
    public List<Usuario> getUser() {
        return userRepository.findAll();
    }

    @PostMapping
    public boolean checkUser(@RequestBody Usuario usuario) {
        for(Usuario user: getUser()) {
            if(user.getUsername().equals(usuario.getUsername()) && user.getPassword().equals(usuario.getPassword())){
                return true;
            }
        }
        return false;
    }
}
