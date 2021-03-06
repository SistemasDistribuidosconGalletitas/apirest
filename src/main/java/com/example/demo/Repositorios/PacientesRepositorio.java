package com.example.demo.Repositorios;


import com.example.demo.Entidades.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PacientesRepositorio extends JpaRepository<Paciente, Integer> {

    Paciente findByNombreUsuarioAndContrasenia(String nombreUsuario, String contrasenia);

}
