package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String letra = "Ç";
		System.out.println(letra);
		System.out.println(letra.codePointAt(0));
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());
	
		byte [] bytes = letra.getBytes("Windows-1252"); 
		System.out.println(bytes.length+", Windows-1252");
		String novaLetra = new String(bytes, "Windows-1252");
		System.out.println(novaLetra +"\r\n");
		
		bytes = letra.getBytes("UTF-8");
		System.out.println(bytes.length+", UTF-8");
		novaLetra = new String(bytes, "UTF-8");
		System.out.println(novaLetra+"\r\n");
		

		bytes = letra.getBytes("UTF-16");
		System.out.println(bytes.length+", UTF-16");
		novaLetra = new String(bytes, "UTF-16");
		System.out.println(novaLetra+"\r\n");
		
		bytes = letra.getBytes(StandardCharsets.US_ASCII);
		System.out.println(bytes.length+", US-ASCII");
		novaLetra= new String(bytes, StandardCharsets.US_ASCII);
		System.out.println(novaLetra);
	}

}
