package com.example.demo.Controladores;

import com.example.demo.Entidades.Paciente;
import com.example.demo.Repositorios.PacientesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/api/ssm")
public class PacientesControlador {

    @Autowired
    PacientesRepositorio pacientesRepositorio;

    @GetMapping("/pacientes")
    public List<Paciente> getPacientes(){
        System.out.println("Hola!");
        return pacientesRepositorio.findAll();
    }
}
