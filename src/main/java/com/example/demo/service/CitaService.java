package com.example.demo.service;


import com.example.demo.model.Cita;
import com.example.demo.repository.CitaRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/*Aqui se encuentra el codigo de los metodos (servicios) que se llaman en AdminController*/
@Service
public class CitaService {
    @Autowired
    private CitaRepository citaRepository;

}
