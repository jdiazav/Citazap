package com.example.demo.controller;

import com.example.demo.model.Cita;
import com.example.demo.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/citas") //las citas se ponen el la direccion citas
public class CitaController {
    @Autowired
    private CitaService citaService;

    @GetMapping
    public List<Cita> obtenerTodas() {
        return citaService.obtenerTodas();
    }

    /*Metodo para crear obtener una cita por su ID */
    @GetMapping("/{id}")
    public Optional<Cita> obtenerPorId(@PathVariable String id) {
        return citaService.obtenerPorId(id);
    }

    /*Metodo para obtener las citas de un usuario */
    @GetMapping("/usuario/{usuarioId}")
    public List<Cita> obtenerPorUsuario(@PathVariable String usuarioId) {
        return citaService.obtenerPorUsuario(usuarioId);
    }

    /*Metodo para obtener las citas de un usuario */
    @GetMapping("/cliente/{clienteId}")
    public List<Cita> obtenerPorCliente(@PathVariable String clienteId) {
        return citaService.obtenerPorCliente(clienteId);
    }
    /*Metodo para crear una cita*/
    @PostMapping
    public Cita crearCita(@RequestBody Cita cita) {
        return citaService.crearCita(cita);
    }
    /*Metodo para actualizar una cita*/
    @PutMapping("/{id}")
    public Cita actualizarCita(@PathVariable String id, @RequestBody Cita cita) {
        return citaService.actualizarCita(id, cita);
    }
    /*Metodo para eliminar una cita*/
    @DeleteMapping("/{id}")
    public void eliminarCita(@PathVariable String id) {
        citaService.eliminarCita(id);
    }
}