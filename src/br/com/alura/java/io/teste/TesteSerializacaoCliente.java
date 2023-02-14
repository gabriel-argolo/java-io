package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
//		Cliente c = new Cliente();
//		c.setNome("Gabriel Argolo");
//		c.setCpf("123456789");
//		c.setProfissao("DEV");
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(c);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente teste = (Cliente)ois.readObject();
		System.out.println(teste.getCpf()+" "+teste.getNome());
	}

}
