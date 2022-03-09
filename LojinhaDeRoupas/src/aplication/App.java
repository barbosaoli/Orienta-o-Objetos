package aplication;
import model.Loja;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args ) {
		Loja loja = new Loja("Lojinha da Esquina","Vicente Pires", "86.896.436/0001-89");
		
		
		boolean exit = false;
		
		while(!exit) {
			System.out.println("----------------- Jogo Da Forca -----------------");
			System.out.println("1.Cadastrar Funcionário"); 
			System.out.println("2.Cadastrar Cliente");
			System.out.println("3.Jogar");
			System.out.println("4.Sair\n");
			System.out.print("Opção: ");
			
			String sel = scan.nextLine();
			
			switch(sel) {
				case "1":
					menuFuncionario(loja);
					
					break;
				
				case "2":
					
					break;
					
				case "3":
					
					break;
			
				case "4":
					
					exit = true;
					break;
	
				default:
					exit = true;
				
			}
		}
		
		
		scan.close();
    	System.out.print("\n\n ----------------- Sistema Encerrado ----------------- \n\n");
	}
	
	static void menuFuncionario(Loja loja) {
		System.out.println("----------------- Menu Funcionários -----------------");
		System.out.println("1.Cadastro");
		System.out.println("2.Exclusão");
		System.out.println("3.Busca");
		System.out.println("4.Sair");
		
		String sel = scan.nextLine();
		
		switch(sel) {
			case "1":
				
				break;
			case "2":
				
				break;
			case "3":
			
				break;
			default:
				break;
		}
		
		loja.adicionaFuncionario(null);
	}
		
	
}