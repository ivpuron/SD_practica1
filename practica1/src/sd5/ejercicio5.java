package sd5;

import java.io.*;
import java.util.*;

public class ejercicio5 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
			// TODO Auto-generated method stub
			Contactos contactos = new Contactos();
			contactos.addDatos("ivan", "987654321", "ivpuron@unirioja.es");
			contactos.addDatos("lalalla", "4564","lalala@unirioja.es");
			
			//escribirContactos(contactos);
			Contactos c = leerContactos("ejercicio10.txt");
			System.out.println("ivan: "+c.getEmail("ivan")+ " " + c.getTfno("ivan"));
			System.out.println("lalalla: "+c.getEmail("lalalla")+ " " + c.getTfno("lalalla"));
			
			System.out.println("originaal: " + contactos.TamanoMaximoAgenda);
			System.out.println("deserializado: " + c.TamanoMaximoAgenda);
		}
	
	public static void escribirContactos(Contactos contactos) throws IOException {
		try(FileOutputStream f = new FileOutputStream("ejercicio10.txt");
				ObjectOutputStream oos = new ObjectOutputStream(f)){
			oos.writeObject(contactos);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static Contactos leerContactos(String name) throws  IOException, ClassNotFoundException {
		Contactos contactos = null;
		try(FileInputStream f = new FileInputStream(name);
				ObjectInputStream ois = new ObjectInputStream(f);
						){
			contactos = (Contactos ) ois.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return contactos;
	}

}
