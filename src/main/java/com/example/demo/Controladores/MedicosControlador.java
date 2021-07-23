package com.example.demo.Controladores;


import com.example.demo.Entidades.Medico;
import com.example.demo.Repositorios.MedicosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/api/ssm")
public class MedicosControlador {
    @Autowired
    MedicosRepositorio medicosRepositorio;

    @GetMapping("/medicos")
    public List<Medico> getMedicos(){
        System.out.println("Hola!");
        return medicosRepositorio.findAll();
    }
}
