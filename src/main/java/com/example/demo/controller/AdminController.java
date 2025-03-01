package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admins") //los metodos de los administradores se ponen en la direccion admins
public class AdminController {
    @Autowired
    private AdminService adminService;
    /*Metodo para crear admins */
    @PostMapping
    public Admin crearAdmin(@RequestBody Admin admin) {
        return adminService.crearAdmin(admin);
    }
}
