package com.example.demo.controller;

import com.example.demo.model.Cita;
import com.example.demo.model.Cliente;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/{usuarioId}/clientes")
    public Usuario agregarCliente(@PathVariable ObjectId usuarioId, @ModelAttribute Cliente cliente) {
        return usuarioService.agregarCliente(usuarioId, cliente);
    }

    @PostMapping("/{usuarioId}/citas")
    public Usuario agregarCita(@PathVariable ObjectId usuarioId, @ModelAttribute Cita cita) {
        return usuarioService.agregarCita(usuarioId, cita);
    }
}