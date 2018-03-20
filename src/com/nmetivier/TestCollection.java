package com.nmetivier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
	public static void testerLesCollections() {
		// Je cr�er une variable de type g�n�rique 'Collection' (parent)
		// La variable prend en valeur un objet de type ArrayList.
		Collection names = new ArrayList();
		
		// J'ajoute de nouveaux �l�ments dans ma collection.
		names.add("tmp.txt");
		names.add("toto.odt");
		
		// La premiere toute premiere fois qu'on rentre dans la boucle,
		// on va cr�er une variable de type Iterator qui sera initialiser
		// � partir de la fonction '.iterator()' disponible dans l'objet
		// names.
		// Et � chaque passage dans la boucle, on v�rifie qu'il existe
		// un �l�ment suivant.
		for (Iterator it = names.iterator(); it.hasNext();) {
			String name = (String) it.next();
			System.out.println("Nom trouv� : " + name);
		}

		
	}
}
