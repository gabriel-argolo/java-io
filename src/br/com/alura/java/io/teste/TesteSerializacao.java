package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//		String nome = "Gabriel Argolo";
		//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
		//		oos.writeObject(nome);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String teste = (String)ois.readObject();
		System.out.println(teste);
	}

}
