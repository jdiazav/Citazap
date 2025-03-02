package com.example.demo;

import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
public class Citazap{
    public static void main(String[] args) {
        SpringApplication.run(Citazap.class, args);
    }
    @GetMapping("/test")
    public List<Usuario> test() {
        UsuarioService usuarioService = new UsuarioService();
        return usuarioService.findAll();
    }
}
