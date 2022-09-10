package com.proyectodePruebaUdeA.ciclo3.modelos;


import javax.persistence.*;
import javax.persistence.GenerationType;
import java.util.Date;

@Entity
@Table(name="Movimientos")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private int id;
    @Column(name = "monto")
    private long monto;
    @Column(name = "concepto")
    private String concepto;
    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado usuario;

    @Column(name = "creadoEn")
    private Date creadoEn;
    @Column(name = "actualizadoEn")
    private Date actualizadoEn;

    public MovimientoDinero() {
    }

    public MovimientoDinero(long monto, String concepto, Empleado empleado) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = empleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getUsuario()
    {
        return usuario;
    }

    public void setUsuario(Empleado empleado) {

        this.usuario = empleado;
    }
}
