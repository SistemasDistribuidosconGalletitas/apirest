package com.example.demo.Controladores;


import com.example.demo.Entidades.Paciente;
import com.example.demo.Entidades.Receta;
import com.example.demo.Repositorios.RecetasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path= "/api/ssm")
public class RecetasControlador {
    @Autowired
    RecetasRepositorio recetasRepositorio;

    @GetMapping(value = "/recetas")
    public List<Receta> getRecetas(){
        return recetasRepositorio.findAll();
    }

    @GetMapping(value = "/recetas/{id}")
    public List<Receta> getRecetasbyPaciente(@PathVariable("id") int id){
        return recetasRepositorio.findByPaciente(id);
    }

}
