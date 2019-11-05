package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramAutomatic {

	public static void main(String[] args) {
		
	String path = "c:\\Users\\Zé\\Documents\\in.txt";
	
	try(BufferedReader br = new BufferedReader(new FileReader(path))) {
		
		String line =br.readLine();
		
		while(line !=null) { //leu com sucesso a linha
			System.out.println(line);
			line= br.readLine();
	}
	
			
	}catch(IOException e) {
		System.out.println("Error: " +e.getMessage());
	
	

}
}
}