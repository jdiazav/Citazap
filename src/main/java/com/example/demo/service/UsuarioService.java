package com.example.demo.service;

import com.example.demo.model.Cliente;
import com.example.demo.model.Usuario;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UserRepository userRepository;
    /*Se obtienen los usuario por ID (util para administradores)*/
    public Optional<Usuario> obtenerPorId(String id) {
        return userRepository.findById(id).map(u -> (Usuario) u);
    }

    /*Se crea un usuario*/
    public Usuario crearUsuario(Usuario usuario) {
        return userRepository.save(usuario);
    }

    /*Se cre y agrega un cliente a un usuario*/
    public Usuario agregarCliente(String usuarioId, Cliente nuevoCliente) {
        return userRepository.findById(usuarioId)
                .map(u -> {
                    Usuario usuario = (Usuario) u;
                    usuario.getClientes().add(nuevoCliente);
                    return userRepository.save(usuario);
                }).orElse(null);
    }

    /*Se elimina un cliente de un usuario*/
    public Usuario eliminarCliente(String usuarioId, String clienteId) {
        return userRepository.findById(usuarioId)
                .map(u -> {
                    Usuario usuario = (Usuario) u;
                    usuario.getClientes().removeIf(c -> c.getId().equals(clienteId));
                    return userRepository.save(usuario);
                }).orElse(null);
    }
}
