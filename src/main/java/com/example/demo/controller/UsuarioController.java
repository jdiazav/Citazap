package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public Optional<Usuario> obtenerPorId(@PathVariable String id) {
        return usuarioService.obtenerPorId(id);
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return usuarioService.crearUsuario(usuario);
    }

    @PostMapping("/{id}/clientes")
    public Usuario agregarCliente(@PathVariable String id, @RequestBody Cliente cliente) {
        return usuarioService.agregarCliente(id, cliente);
    }

    @DeleteMapping("/{id}/clientes/{clienteId}")
    public Usuario eliminarCliente(@PathVariable String id, @PathVariable String clienteId) {
        return usuarioService.eliminarCliente(id, clienteId);
    }
}