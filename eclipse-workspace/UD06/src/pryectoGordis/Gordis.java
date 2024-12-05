package pryectoGordis;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gordis extends Persona{

	private String codigo;
	
	private double altura;
	
	ArrayList <Medicion> a;
	
	
	public Gordis(String n, LocalDate FechaNacimiento, double altura2) {
		super(n, FechaNacimiento);
		this.codigo="";
		this.altura=0;
		this.a = new ArrayList<Medicion>();
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public ArrayList<Medicion> getA() {
		return a;
	}


	public void setA(ArrayList<Medicion> a) {
		this.a = a;
	}


	@Override
	public String toString() {
		return "Gordis [codigo=" + codigo + ", altura=" + altura + ", a=" + a + ", toString()=" + super.toString()
				+ "]";
	}
	
	 public static void codigo(String n, LocalDate FechaNacimiento) {
		    System.out.println(n.substring(0, 2).toUpperCase()+"-"+(FechaNacimiento.getYear()+"").substring(2,3));
		    String codigo;
		    codigo=n.substring(0, 2).toUpperCase()+"-"+(FechaNacimiento.getYear()+"").substring(2,3);
		  }
	
	

}

