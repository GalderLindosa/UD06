package pryectoGordis;

import java.time.LocalDate;

public class Pesadores extends Persona {

	private LocalDate FechaAlta;
	
	public Pesadores (String n, LocalDate FechaNacimiento) {
		super(n, FechaNacimiento);
		this.FechaAlta=FechaAlta;
	}

	public LocalDate getFechaAlta() {
		return FechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		FechaAlta = fechaAlta;
	}

	@Override
	public String toString() {
		return "Pesadores [FechaAlta=" + FechaAlta + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
