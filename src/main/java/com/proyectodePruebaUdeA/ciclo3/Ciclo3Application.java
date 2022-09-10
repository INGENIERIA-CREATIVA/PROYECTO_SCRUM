package com.proyectodePruebaUdeA.ciclo3;

import com.proyectodePruebaUdeA.ciclo3.modelos.Empleado;
import com.proyectodePruebaUdeA.ciclo3.modelos.Empresa;
import com.proyectodePruebaUdeA.ciclo3.modelos.Enum_Roles;
import com.proyectodePruebaUdeA.ciclo3.modelos.MovimientoDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;



@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
public class Ciclo3Application {

	@GetMapping("/hello")
	public String hello(){
		return "Hola ";
	}


	@GetMapping("/testEmpresa")
	public String testEmpresa(){
		Empresa empresa = new Empresa("ssss","dddd","4563214","45632141-8");
		empresa.setNombre("SQLFULLPACKAGE SAS");
		return empresa.getNombre();
	}

	@GetMapping("/testEmpleado")
	public String testEmpleado(){
		Empleado empleado = new Empleado("Juan", "juan@empresa.com", Enum_Roles.Administrador);
		empleado.setNombre("Felipe");
		return empleado.getNombre();
	}

	@GetMapping("/testMovimiento")
	public String testMovimiento(){
		MovimientoDinero md = new MovimientoDinero(500000,"Pago", new Empleado());
		md.setConcepto("Compra");
		return md.getConcepto();
	}


	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}
