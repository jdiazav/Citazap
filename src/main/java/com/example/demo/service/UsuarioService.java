package com.example.demo.service;

import com.example.demo.model.Cita;
import com.example.demo.model.Cliente;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }
    /*Se obtienen los usuario por ID
    * tambien lo usa la clase panel para tener los datos del usuario*/
    public Optional<Usuario> obtenerPorId(ObjectId id) {
        return usuarioRepository.findById(id);
    }

    public Cliente obtenerClientePorId(ObjectId usuarioId, ObjectId clienteId) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(usuarioId);
        if (usuarioOptional.isPresent()) { // Verifica si el usuario existe
            Usuario usuario = usuarioOptional.get();
            for (Cliente cliente : usuario.getClientes()) { // Itera sobre la lista de clientes
                if (cliente.getId() != null && cliente.getId().equals(clienteId)) { // Verifica que el ID no sea null
                    return cliente;
                }
            }
        }
        return null;
    }

    public Usuario agregarCliente(ObjectId usuarioId, Cliente cliente) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            usuario.getClientes().add(cliente);
            return usuarioRepository.save(usuario);
        } else {
            throw new RuntimeException("Usuario no encontrado");
        }
    }

    public Usuario agregarCita(ObjectId usuarioId, Cita cita) {
        Optional<Usuario> usuarioOpt = usuarioRepository.findById(usuarioId);
        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            usuario.getAgenda().add(cita);
            return usuarioRepository.save(usuario);
        }
        else {
            throw new RuntimeException("Usuario no encontrado");
        }
    }
}
