package com.example.demo.service;


import com.example.demo.model.Cita;
import com.example.demo.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CitaService {
    @Autowired
    private CitaRepository citaRepository;

    public List<Cita> obtenerTodas() {
        return citaRepository.findAll();
    }

    public Optional<Cita> obtenerPorId(String id) {
        return citaRepository.findById(id);
    }

    public List<Cita> obtenerPorUsuario(String usuarioId) {
        return citaRepository.findByUsuarioId(usuarioId);
    }

    public List<Cita> obtenerPorCliente(String clienteId) {
        return citaRepository.findByClienteId(clienteId);
    }

    public Cita crearCita(Cita cita) {
        return citaRepository.save(cita);
    }

    public Cita actualizarCita(String id, Cita citaActualizada) {
        return citaRepository.findById(id)
                .map(cita -> {
                    cita.setFechaHora(citaActualizada.getFechaHora());
                    cita.setDescripcion(citaActualizada.getDescripcion());
                    return citaRepository.save(cita);
                }).orElse(null);
    }

    public void eliminarCita(String id) {
        citaRepository.deleteById(id);
    }
}
