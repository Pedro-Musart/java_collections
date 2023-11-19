package java_collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio_4 {

	public static void main(String[] args) {
		
		Set<Integer> meuSet = new HashSet<Integer>();
		int n;
		Scanner input = new Scanner(System.in);
		
		
		meuSet.add(2);
		meuSet.add(5);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(9);
		meuSet.add(7);
		meuSet.add(8);
		meuSet.add(10);
		meuSet.add(6);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		n = input.nextInt();
		
		if (meuSet.contains(n)) {
			System.out.println("O número " + n +" foi encontrado!");
		}else {
			System.out.println("O número " + n + " não foi encontrado!");
		}
		
		
		
	}
}
