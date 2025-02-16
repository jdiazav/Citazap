package com.example.demo.service;


import com.example.demo.model.Admin;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private UserRepository userRepository;

    public Admin crearAdmin(Admin admin) {
        return userRepository.save(admin);
    }
}
