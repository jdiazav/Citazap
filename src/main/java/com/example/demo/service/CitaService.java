package com.example.demo.service;


import com.example.demo.model.Cita;
import com.example.demo.repository.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/*Aqui se encuentra el codigo de los metodos (servicios) que se llaman en AdminController*/
@Service
public class CitaService {
    @Autowired
    private CitaRepository citaRepository;
    /*Obtiene todos los datos que se encuentran en el servidor (metodo findAll)*/
    public List<Cita> obtenerTodas() {
        return citaRepository.findAll();
    }
    /*Obtiene todos las citas por ID de la cita findByID*/
    public Optional<Cita> obtenerPorId(String id) {
        return citaRepository.findById(id);
    }

    /*Obtiene todas las citas por ID de usuario, metodo findByUsuarioID*/
    public List<Cita> obtenerPorUsuario(String usuarioId) {
        return citaRepository.findByUsuarioId(usuarioId);
    }

    /*Obtiene todas las citas por ID de un cliente, metodo findByID*/
    public List<Cita> obtenerPorCliente(String clienteId) {
        return citaRepository.findByClienteId(clienteId);
    }

    public Cita crearCita(Cita cita) {
        return citaRepository.save(cita);
    }

    /*Actualiza los datos de una cita*/
    public Cita actualizarCita(String id, Cita citaActualizada) {
        return citaRepository.findById(id)
                .map(cita -> {
                    cita.setFechaHora(citaActualizada.getFechaHora());
                    cita.setDescripcion(citaActualizada.getDescripcion());
                    return citaRepository.save(cita);
                }).orElse(null);
    }
    /*Elimina una cita de la base de datos*/
    public void eliminarCita(String id) {
        citaRepository.deleteById(id);
    }
}
