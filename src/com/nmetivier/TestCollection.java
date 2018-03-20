package com.nmetivier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
	public static void testerLesCollections() {
		// Je créer une variable de type générique 'Collection' (parent)
		// La variable prend en valeur un objet de type ArrayList.
		Collection names = new ArrayList();
		
		// J'ajoute de nouveaux éléments dans ma collection.
		names.add("tmp.txt");
		names.add("toto.odt");
		
		// La premiere toute premiere fois qu'on rentre dans la boucle,
		// on va créer une variable de type Iterator qui sera initialiser
		// à partir de la fonction '.iterator()' disponible dans l'objet
		// names.
		// Et à chaque passage dans la boucle, on vérifie qu'il existe
		// un élément suivant.
		for (Iterator it = names.iterator(); it.hasNext();) {
			String name = (String) it.next();
			System.out.println("Nom trouvé : " + name);
		}

		
	}
}
