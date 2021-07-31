/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Cristhian Enrique
 */
@Entity
@Table(name = "Receta")

public class Receta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_receta")
    private Integer idReceta;
    @Column(name = "fecha_consulta")
    @Temporal(TemporalType.DATE)
    private Date fechaConsulta;
    @Column(name = "receta_fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date recetafechaInicio;
    @Column(name = "receta_fechaFin")
    @Temporal(TemporalType.DATE)
    private Date recetafechaFin;
    @Column(name = "id_paciente")
    private int paciente;
    @Column(name = "id_medico")
    private int medico;

    public int getMedico() {
        return medico;
    }

    public void setMedico(int medico) {
        this.medico = medico;
    }

    public int getPaciente() {
        return paciente;
    }

    public void setPaciente(int paciente) {
        this.paciente = paciente;
    }

    public Receta() {
    }

    public Receta(Integer idReceta) {
        this.idReceta = idReceta;
    }

    public Integer getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Integer idReceta) {
        this.idReceta = idReceta;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public Date getRecetafechaInicio() {
        return recetafechaInicio;
    }

    public void setRecetafechaInicio(Date recetafechaInicio) {
        this.recetafechaInicio = recetafechaInicio;
    }

    public Date getRecetafechaFin() {
        return recetafechaFin;
    }

    public void setRecetafechaFin(Date recetafechaFin) {
        this.recetafechaFin = recetafechaFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReceta != null ? idReceta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receta)) {
            return false;
        }
        Receta other = (Receta) object;
        if ((this.idReceta == null && other.idReceta != null) || (this.idReceta != null && !this.idReceta.equals(other.idReceta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.Entidades.Receta[ idReceta=" + idReceta + " ]";
    }
    
}
