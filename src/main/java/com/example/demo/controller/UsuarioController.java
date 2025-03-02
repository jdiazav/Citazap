package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.model.Usuario;
import com.example.demo.service.UsuarioService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@Controller

public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/panel")
    public String getUserPanel(@RequestParam("id") ObjectId id, Model model) {
        Optional<Usuario> usuario = usuarioService.obtenerPorId(id);

        if (usuario.isPresent()) {
            model.addAttribute("usuario", usuario.get());
            model.addAttribute("agenda", usuario.get().getAgenda());
            model.addAttribute("clientes", usuario.get().getClientes());
        } else {
            return "error";
        }
        return "panel";
    }

    @GetMapping("/cliente")
    public String getClientePanel(@RequestParam("usuarioId") ObjectId usuarioId,
                                  @RequestParam("clienteId") ObjectId clienteId,
                                  Model model) {
        Cliente cliente = usuarioService.obtenerClientePorId(usuarioId, clienteId);
        if (cliente != null) {
            model.addAttribute("cliente", cliente);
            model.addAttribute("usuarioId", usuarioId);
            return "cliente"; // Vista cliente.html
        } else {
            return "error"; // Vista de error si no se encuentra el cliente
        }
    }
    @GetMapping("/nuevaCita")
    public String getNuevaCita(@RequestParam("usuarioId") ObjectId usuarioId, Model model){
        model.addAttribute("usuarioId", usuarioId);
        return "nuevaCita";
    }

    @GetMapping("/nuevoCliente")
    public String getNuevoCliente(@RequestParam("usuarioId") ObjectId usuarioId, Model model){
        if (usuarioId != null) {
            model.addAttribute("usuarioId", usuarioId);
            return "nuevoCliente";
        } else {
            return "error";
        }

    }



}