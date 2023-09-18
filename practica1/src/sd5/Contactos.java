package sd5;

import java.io.*;
import java.util.*;

public class Contactos implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public  int TamanoMaximoAgenda = 1000;
	public static class Datos implements Serializable{
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private String email;
		private String tfno;
		
		
		public Datos(String email, String telefono) {
			this.email = email;
			this.tfno = telefono;
			
		}
		
		public String getTfno() {
			return tfno;
		}
		public String getEmail() {
			return email;
		}
	}
	
	private HashMap<String, Datos> agenda = new HashMap<String, Datos>();
	
	public void addDatos(String nombre, String tfno, String email) {
		agenda.put(nombre, new Datos(email, tfno));
	}
	
	public String getTfno(String nombre) {
		return agenda.get(nombre).getTfno();
	}
	
	public String getEmail(String nombre) {
		return agenda.get(nombre).getEmail();
	}
	
	
}
