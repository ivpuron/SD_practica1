package sd5;

import java.io.*;

public class ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void editarFichero(String iniciales, String name) throws IOException {
		try(DataInputStream dis = new DataInputStream(new FileInputStream(name));
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(name))){
			String linea = dis.readLine();
			while(linea != null) {
				dos.writeChars(linea + " " +iniciales +"\n");
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
