package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
	String path = "c:\\Users\\Zé\\Documents\\in.txt";
	FileReader fr=null;
	BufferedReader br=null;
	
	try {
		fr= new FileReader(path); //sequencia de leitura a partir desse caminho
		br= new BufferedReader(fr); //deixa mais flexivel
		
		String line =br.readLine();
		
		while(line !=null) { //leu com sucesso a linha
			System.out.println(line);
			line= br.readLine();
	}
	
			
	}catch(IOException e) {
		System.out.println("Error: " +e.getMessage());
	}
	finally {
		try {
			
		
			if(br!=null) {
				br.close();
			}
			if(fr!=null) {
				fr.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	

}
}
