package com.example.demo.Repositorios;

import com.example.demo.Entidades.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicosRepositorio  extends JpaRepository<Medico, Integer> {

}
