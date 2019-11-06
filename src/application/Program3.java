package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Program3 {

	public static void main(String[] args) {
		//CRIA O ARQUIVO E GRAVA A MENSAGEM ABAIXO 
		String[]lines = new String[] {"Good morning" ,"Good afternon!","good night!"};
		//criar arquivo e gravar os dados no arquivo
		String patch = "c:\\Users\\Zé\\Documents\\out.txt";		//true pra n recriar o arquivo e acrescentar dnv
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(patch,true))){
			for(String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
}
}
