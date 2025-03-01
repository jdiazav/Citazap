package com.example.demo.service;
import com.example.demo.model.Admin;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*Aqui se encuentra el codigo de los metodos que se llaman en AdminController*/

@Service
public class AdminService {
    @Autowired
    private UserRepository userRepository;

    public Admin crearAdmin(Admin admin) {
        return userRepository.save(admin);
    }
}
