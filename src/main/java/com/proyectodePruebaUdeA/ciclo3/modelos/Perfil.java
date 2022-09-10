package com.proyectodePruebaUdeA.ciclo3.modelos;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Perfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private String id;
    @Column(name = "foto")
    private String foto;
    @Column(name = "telefono")
    private String telefono;
    @OneToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
    @Column(name = "creadoEn")
    private Date creadoEn;
    @Column(name = "actualizadoEn")
    private Date actualizadoEn;

    public Perfil() {
    }

    public Perfil(String foto, String telefono, Empleado empleado, Date creadoEn, Date actualizadoEn) {
        this.foto = foto;
        this.telefono = telefono;
        this.empleado = empleado;
        this.creadoEn = creadoEn;
        this.actualizadoEn = actualizadoEn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Date getCreadoEn() {
        return creadoEn;
    }

    public void setCreadoEn(Date creadoEn) {
        this.creadoEn = creadoEn;
    }

    public Date getActualizadoEn() {
        return actualizadoEn;
    }

    public void setActualizadoEn(Date actualizadoEn) {
        this.actualizadoEn = actualizadoEn;
    }
}