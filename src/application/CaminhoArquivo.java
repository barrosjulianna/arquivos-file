package application;

import java.io.File;
import java.util.Scanner;

public class CaminhoArquivo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		//c:\\Users\\Zé\\Documents
		File path = new File(strPath);
		
		//acessar um único arquivo, retorna o nome dele
		System.out.println("getParent: "+ path.getName());
		//só o caminho, desprezando o nome
		System.out.println("getParent: "+path.getParent());
		//caminho e nome
		System.out.println("gerPatch: " +path.getPath());
		sc.close();

	}

}
