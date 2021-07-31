package com.example.demo.Repositorios;

import com.example.demo.Entidades.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecetasRepositorio extends JpaRepository<Receta, Integer> {

    List<Receta> findByPaciente(int id);
}
