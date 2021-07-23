package com.example.demo.Controladores;


import com.example.demo.Entidades.Medico;
import com.example.demo.Repositorios.MedicosRepositorio;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.apache.catalina.mapper.Mapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/medicos/ejemplo")
    public Map<String, String> sayHello() {
        HashMap<String, String> map = new HashMap<>();
        map.put("paciente", "Cristhian Enrique");
        map.put("Medico", "Doctor Simi");
        map.put("Fecha consulta","12/11/2021");
        map.put("medicamento", "Parecetamol");
        return map;
    }

}
