package com.example.demo.controller;

import com.example.demo.model.Cita;
import com.example.demo.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/citas")
public class CitaController {
    @Autowired
    private CitaService citaService;

    @GetMapping
    public List<Cita> obtenerTodas() {
        return citaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public Optional<Cita> obtenerPorId(@PathVariable String id) {
        return citaService.obtenerPorId(id);
    }

    @GetMapping("/usuario/{usuarioId}")
    public List<Cita> obtenerPorUsuario(@PathVariable String usuarioId) {
        return citaService.obtenerPorUsuario(usuarioId);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Cita> obtenerPorCliente(@PathVariable String clienteId) {
        return citaService.obtenerPorCliente(clienteId);
    }

    @PostMapping
    public Cita crearCita(@RequestBody Cita cita) {
        return citaService.crearCita(cita);
    }

    @PutMapping("/{id}")
    public Cita actualizarCita(@PathVariable String id, @RequestBody Cita cita) {
        return citaService.actualizarCita(id, cita);
    }

    @DeleteMapping("/{id}")
    public void eliminarCita(@PathVariable String id) {
        citaService.eliminarCita(id);
    }
}