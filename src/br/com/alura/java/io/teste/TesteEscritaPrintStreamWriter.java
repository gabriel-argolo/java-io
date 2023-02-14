package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintStream;

public class TesteEscritaPrintStreamWriter {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//		OutputStream fo = new FileOutputStream("Lorem2.txt");
		//		Writer os = new OutputStreamWriter(fo);
		//		BufferedWriter bw = new BufferedWriter(os);
		//		

		long ini = System.currentTimeMillis();
		PrintStream ps = new PrintStream("Lorem2.txt");

		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");
		ps.close();
		
		long fim = System.currentTimeMillis();
		System.out.println("Se passaram: " +(fim-ini) +"ms");
	}

}
