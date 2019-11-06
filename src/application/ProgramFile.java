package application;

import java.io.File;
import java.util.Scanner;

public class ProgramFile {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		//pedir pro usuario digitar o caminho
		System.out.println("Enter a folder path: ");
		String strPath=sc.nextLine();
		
		File path = new File(strPath);
		//pegar todas as pastas q estao a partir desse caminho
										//LISTAR SOMENTE QUEM FOR DIRETORIO OU PASTA (FUNC LAMBIDA)
		File[] folders= path.listFiles(File::isDirectory);
		System.out.println("Folders");
		//c:\\Users\\Zé\\Documents\\
		//LISTA TODAS AS PASTAS
		for(File folder:folders ) {
			System.out.println(folder);
		}
		//PEGAR LISTA DE ARQUIVOS
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		for(File file:files){
			System.out.println(file);
		}
		
		//criar subpasta a partir da pasta documents
		boolean sucess= new File(strPath + "\\newpasta").mkdir();
		System.out.println("DIRETÓRIO CRIADO COM SUCESSO: "+sucess);
		
		
		
		
		sc.close();

	}

}
