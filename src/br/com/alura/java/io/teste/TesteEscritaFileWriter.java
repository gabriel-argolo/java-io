package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//		OutputStream fo = new FileOutputStream("Lorem2.txt");
		//		Writer os = new OutputStreamWriter(fo);
		//		BufferedWriter bw = new BufferedWriter(os);
		//		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
		bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		bw.newLine();
		bw.write("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

		bw.close();
	}

}
