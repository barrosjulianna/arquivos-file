package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exercicio {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.println("Enter file path: "); //PEDIU PRA DIGITAR O CAMINHO DO ARQUIVO
		String sourceFileStr = sc.nextLine();

		File sourceFile = new File(sourceFileStr); //sourcefile recebendo o caminho q digitou
		String sourceFolderStr = sourceFile.getParent();//pega a pasta q ta o arquivo (Documents)
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir(); //criar subpasta dentro do documents caminho
								//pasta atual MAIS dentro da pasta out o novo arquivo
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv"; //cria o arquivo com esse nome

		//LER
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) { //arquivo q pediu pra digitar 

			String itemCsv = br.readLine(); //LER A LINHA DO ARQUIVO SE TIVER NO FINAL VAI RETORNAR NULO 
			while (itemCsv != null) {

				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				list.add(new Product(name, price, quantity));

				itemCsv = br.readLine(); //LE A LINHA 
			}
			//ESCREVER
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) { //targetfile é o caminho do novo arquivo

				for (Product item : list) {
					bw.write(item.getName() + "," + String.format("%.2f", item.total())); //escreve essa linha
					bw.newLine();//quebra de linha
				}

				System.out.println(targetFileStr + " CREATED!");
				
			} catch (IOException e) {
				System.out.println("Error writing file: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		sc.close();
	}
}