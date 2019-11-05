package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Program3 {

	public static void main(String[] args) {
		
		String[]lines = new String[] {"Good morning" ,"Good afternon!","good night!"};
		//criar arquivo e gravar os dados no arquivo
		String patch = "c:\\Users\\Zé\\Documents\\out.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(patch))){
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
