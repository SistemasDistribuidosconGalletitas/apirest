package com.example.demo.Repositorios;

import com.example.demo.Entidades.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicamentosRepositorio extends JpaRepository<Medicamento, Integer> {

}
