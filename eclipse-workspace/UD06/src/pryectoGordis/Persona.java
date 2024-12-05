package pryectoGordis;

import java.time.LocalDate;

public class Persona {

	protected String nombre;
	protected LocalDate FechaNacimiento;
	
	public Persona (String n, LocalDate FechaNacimiento) {
		this.nombre=n;
		this.FechaNacimiento=FechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", FechaNacimiento=" + FechaNacimiento + "]";
	}
	
	
}
