package java_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner input = new Scanner(System.in);
		int n, i = 0;
		boolean encontrado = false;
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(9);
		list.add(7);
		list.add(8);
		list.add(10);
		list.add(6);
		
		System.out.println("Digite o número que você deseja encontrar:");
		n = input.nextInt();
		
		for(int valor : list) {
			
			if(valor == n) {
				System.out.println("O número " + n + " está localizado na posição: " + i);
				encontrado = true;
			}
			i += 1;
		} 
		
		if (encontrado == false) {
			System.out.println("O número " + n + " não foi encontrado!");
		}
		
		
	}
}
