package com.example.demo.Controladores;


import com.example.demo.Entidades.Medicamento;
import com.example.demo.Repositorios.MedicamentosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/api/ssm")
public class MedicamentosControlador {
    @Autowired
    MedicamentosRepositorio medicamentosRepositorio;

    @GetMapping(value = "/medicamentos")
    public List<Medicamento> getMedicamentos(){
        return medicamentosRepositorio.findAll();
    }
}
