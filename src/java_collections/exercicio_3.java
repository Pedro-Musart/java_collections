package java_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio_3 {
	public static void main(String[] args) {
		
		Set<Integer> meuSet = new HashSet<Integer>();
		Scanner input = new Scanner(System.in);
		
		
		for(int i = 0;i <10;i++ ) {
			System.out.println("Digite um número: ");
			meuSet.add(input.nextInt());
		}
		
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		System.out.println("\nListar dados do Set:");
		while(iMeuSet.hasNext()) {
			System.out.println(iMeuSet.next());
			
		}
	}
}
