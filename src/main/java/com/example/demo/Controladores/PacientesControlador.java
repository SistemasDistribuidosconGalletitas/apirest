package com.example.demo.Controladores;

import com.example.demo.Entidades.Paciente;
import com.example.demo.Repositorios.PacientesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        return pacientesRepositorio.findAll();
    }

    @GetMapping("/pacientes/{nombre}/{contrasenia}")
    public Paciente getPacienteByCorreoContrasenia(@PathVariable("nombre") String nombreUsuario,
                                                   @PathVariable("contrasenia") String contrasenia){
    return pacientesRepositorio.findByNombreUsuarioAndContrasenia(nombreUsuario,contrasenia);

    }
}
