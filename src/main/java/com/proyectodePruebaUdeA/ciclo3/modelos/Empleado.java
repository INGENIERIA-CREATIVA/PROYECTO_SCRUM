package com.proyectodePruebaUdeA.ciclo3.modelos;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "correo", nullable = false, unique = true)
    private String correo;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private Enum_Roles rol;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;

    @OneToOne
    @JoinColumn(name = "perfil_id")
    private Perfil perfil;

    @Column(name = "creadoEn")
    private Date creadoEn;
    @Column(name = "actualizadoEn")
    private Date actualizadoEn;

    public Empleado() {
    }

    public Empleado(String nombre, String correo, Enum_Roles rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Enum_Roles getRol() {
        return rol;
    }

    public void setRol(Enum_Roles rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
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
