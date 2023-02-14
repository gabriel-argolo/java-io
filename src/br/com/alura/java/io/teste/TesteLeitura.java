package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("Lorem.txt");
		InputStreamReader is = new InputStreamReader(fi,"UTF-8");
		BufferedReader br = new BufferedReader(is);
		
		String linha = br.readLine();
		
		while(linha!=null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();
	}

}
