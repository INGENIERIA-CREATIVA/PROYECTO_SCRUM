package com.proyectodePruebaUdeA.ciclo3.controller;
import com.proyectodePruebaUdeA.ciclo3.modelos.Empleado;
import com.proyectodePruebaUdeA.ciclo3.modelos.Empresa;
import com.proyectodePruebaUdeA.ciclo3.service.EmpleadoService;
import com.proyectodePruebaUdeA.ciclo3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class ControllerFull {
    @Autowired
    EmpresaService empresaService;
    @Autowired
    EmpleadoService empleadoService;

  //EMPRESAS

    @GetMapping("/enterprises")
    public List<Empresa> verEmpresa(){
        return empresaService.getAllEmpresa();
    }
    @PostMapping("/enterprises")
    public Empresa guardarEmpresa(@RequestBody Empresa emp){
        return this.empresaService.saveOrUpdateEmpresa(emp);
    }

    @GetMapping(path = "enterprises/{id}")
    public Empresa empresaPorID(@PathVariable("id") Integer id){
       return this.empresaService.getEmpresaById(id);
    }

    @PatchMapping("enterprises/{id}")
    public Empresa actualizarEmpresa(@PathVariable("id") Integer id,@RequestBody Empresa empresa){
        Empresa emp= empresaService.getEmpresaById(id);
        emp.setNombre(empresa.getNombre());
        emp.setDireccion(empresa.getDireccion());
        emp.setTelefono(empresa.getTelefono());
        emp.setNIT(empresa.getNIT());
        return empresaService.saveOrUpdateEmpresa(empresa);
    }
    @DeleteMapping (path = "enterprises/{id}")
    public String DeleteEmpresa(@PathVariable("id") Integer id) {
        boolean respuesta = this.empresaService.deleteEmpresa(id);
        if (respuesta) { //Si respuesta es true?
            return "Se elimino la empresa con id" + id;
        } else {
            return "No se pudo eliminar la empresa con id" + id;
        }
    }
    //EMPLEADOS
    @GetMapping("/empleados") //Ver los json de todos los empleados
    public List<Empleado> verEmpleados(){
        return empleadoService.getAllEmpleado();
    }

    @PostMapping("/empleados") //Guardar un nuevo empleado
    public Optional<Empleado> guardarEmpleado(@RequestBody Empleado empl){
        return Optional.ofNullable(this.empleadoService.saveOrUpDateEmpleado(empl));
    }

    @GetMapping(path = "empleados/{id}")//Consultar empleado por ID
    public Optional<Empleado> empleadoPorID(@PathVariable("id") Integer id){
        return this.empleadoService.getEmpleadoById(id);
    }
    @GetMapping("/enterprises/{id}/empleados")//Consultar empleado por empresa
    public ArrayList<Empleado> EmpleadosPorEmpresa(@PathVariable("id") Integer id){
        return this.empleadoService.obtenerPorEmpresa(id);
    }

    @PatchMapping("/empleados/{id}")
    public Empleado actualizarEmpleado(@PathVariable("id") Integer id, @RequestBody Empleado empleado){
        Empleado empl=empleadoService.getEmpleadoById(id).get();
        empl.setNombre(empleado.getNombre());
        empl.setCorreo(empleado.getCorreo());
        empl.setEmpresa(empleado.getEmpresa());
        empl.setRol(empleado.getRol());
        return empleadoService.saveOrUpDateEmpleado(empl);
    }
    @DeleteMapping("/empleados/{id}") //Metodo para eliminar empleado por id
    public String DeleteEmpleado(@PathVariable("id") Integer id) {
        boolean respuesta = this.empleadoService.deleteEmpleado(id);
        if (respuesta) { //Si respuesta es true?
            return "Se elimino el empleado correctamente  con id" + id;
        } else {
            return "No se pudo eliminar el empleado con id" + id;
        }
    }
}