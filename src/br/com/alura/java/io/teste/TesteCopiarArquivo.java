package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		InputStream fi = System.in; //new FileInputStream("Lorem.txt");
		Reader is = new InputStreamReader(fi);
		BufferedReader br  = new BufferedReader(is);

		OutputStream fo = System.out;//new FileOutputStream("Lorem2.txt");
		Writer os = new OutputStreamWriter(fo);
		BufferedWriter bw = new BufferedWriter(os);

		String linha = br.readLine();

		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		br.close();
		bw.close();
	}

}
