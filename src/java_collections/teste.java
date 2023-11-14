package java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class teste {
	
		public static void main(String[] args) {
			
			List<Integer> minhaLista = new ArrayList<Integer>();
			
			minhaLista.add(2);
			minhaLista.add(4);
			minhaLista.add(1);
			minhaLista.add(2);
			minhaLista.add(1);
			minhaLista.add(7);
			minhaLista.add(5);
			
			for(Integer listaElementos:minhaLista) {
				System.out.println(listaElementos);
			}
			
			System.out.println("\nRemovendo um elemento da lista...");
			System.out.println();
			minhaLista.remove(0);
			
			for(Integer listaElementos:minhaLista) {
				System.out.println(listaElementos);
			}
			
			int primeiroElemento = minhaLista.get(0);
			
			System.out.println("\nO primeiro elemento é: "+primeiroElemento);
			
			System.out.println();
			
			for(int i=0;i<minhaLista.size();i++) { //o método size, pega o tamanho do meu ArrayList
				System.out.println("\nElemento: "+minhaLista.get(i));
			}
			
			Collections.sort(minhaLista);
			
			System.out.println("\nDepois de ordenado...");
			System.out.println(minhaLista);
			
			System.out.println();
			
			Set<Integer> meuSet = new HashSet<Integer>();
			
			meuSet.add(2);
			meuSet.add(1);
			meuSet.add(2);
			meuSet.add(1);
			meuSet.add(5);
			meuSet.add(9);
			meuSet.add(3);
			
			System.out.println(meuSet);
			
			Iterator<Integer> iMeuSet = meuSet.iterator();
			
			while(iMeuSet.hasNext()) {
				System.out.println(iMeuSet.next());
			}

		}

	}

