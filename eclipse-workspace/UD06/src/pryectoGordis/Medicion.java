package pryectoGordis;

import java.time.LocalDate;

public class Medicion {

	private float peso;
	
	private LocalDate fecha;
	
	public Medicion () {
		this.peso=0;
		this.fecha=fecha;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Medicion [peso=" + peso + ", fecha=" + fecha + "]";
	}
	
	
	
	
}
