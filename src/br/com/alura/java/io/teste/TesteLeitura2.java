package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");
		while (scanner.hasNextLine()) {			
			String linha = scanner.nextLine();
			//			System.out.println(linha);
			Scanner linhaScanners = new Scanner(linha);
			linhaScanners.useDelimiter(",");
			linhaScanners.useLocale(Locale.US);

			String tipoConta = linhaScanners.next();
			int agencia = Integer.parseInt(linhaScanners.next());
			int numero = Integer.parseInt(linhaScanners.next());
			String titular = linhaScanners.next();
			double saldo = Double.parseDouble(linhaScanners.next());
			//			System.out.println(tipoConta + agencia + numero + titular + saldo);
			String valorFormatado = String.format(new Locale ("pt","BR"),"%s - %04d-%08d, %20s: %.2f", tipoConta, agencia, numero, titular, saldo);
			System.out.println(valorFormatado);
			linhaScanners.close();
		}
		scanner.close();
	}
}
