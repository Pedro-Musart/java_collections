package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio_1 {
	public static void main(String[] args) {
		
		ArrayList<String> cores = new ArrayList<String>();
		int i;
		
		Scanner input = new Scanner(System.in);
		
		for (i=0;i < 5; i++) {
			System.out.println("Digite uma cor: ");
			cores.add(input.next());
			
		}
		
		System.out.println("\nListar todas as cores: ");
		for (i=0;i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}
		
		Collections.sort(cores);
		
		System.out.println("\nOrdenar as cores: ");
		for (i=0;i < cores.size(); i++) {
			System.out.println(cores.get(i));
		}
		
	}
	}
