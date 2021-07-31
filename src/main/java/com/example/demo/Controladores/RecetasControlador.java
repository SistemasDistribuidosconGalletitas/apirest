package com.example.demo.Controladores;


import com.example.demo.Entidades.Medico;
import com.example.demo.Entidades.Paciente;
import com.example.demo.Entidades.Receta;
import com.example.demo.Repositorios.MedicosRepositorio;
import com.example.demo.Repositorios.RecetasRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path= "/api/ssm")
public class RecetasControlador {
    @Autowired
    RecetasRepositorio recetasRepositorio;

    @Autowired
    MedicosRepositorio medicosRepositorio;

    @GetMapping(value = "/recetas")
    public List<Receta> getRecetas(){
        return recetasRepositorio.findAll();
    }

    @GetMapping(value = "/recetas/{id}")
    public List<Receta> getRecetasbyPaciente(@PathVariable("id") int id){

        List<Receta> recetas = recetasRepositorio.findByPaciente(id);
        for (int i = 0; i <=recetas.size()-1; i++) {
            //for cada receta
            Optional <Medico> aux = medicosRepositorio.findById(recetas.get(i).getMedico());
            recetas.get(i).setNombreMedico(aux.get().getNombreMedico());
        }
        return recetasRepositorio.findByPaciente(id);
    }

}
