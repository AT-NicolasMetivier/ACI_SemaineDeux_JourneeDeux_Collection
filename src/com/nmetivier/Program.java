package com.nmetivier;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// D�claration d'une liste chain�e.
		LinkedList<String> listeChaine = new LinkedList<String>();

		// J'ajout des �l�ments dans ma liste chain�e.
		listeChaine.add("Nicolas");
		listeChaine.add("Adrien");
		listeChaine.add("ok");
		listeChaine.add("Pierre");
		listeChaine.add("Nicolas");
		listeChaine.add("Laure");
		listeChaine.add("Vita");
		listeChaine.add("Misharl");

		 System.out.println("Taille de ma liste chain�e: "+listeChaine.size());
		 System.out.println("\nAffichage de la liste chain�e avec un it�rateur.");

		 afficherListeAvecIterateur(listeChaine);
		 affciherListeAvecForEach(listeChaine);
		 afficherDernierElementDansListe(listeChaine);

		 System.out.print("Combien d'�l�ments souhaites afficher : "); // 
		 Scanner clavier = new Scanner(System.in);
		 int choixUtilisateur = clavier.nextInt(); 
		 System.out.println("Je vais afficher " + choixUtilisateur + " presonnes."); //
		 afficherLesNPremiersElementsDansListe(listeChaine, choixUtilisateur);

		// Je cr�er une variable de type HasSet, qui contient un
		// objet HashSet().
		HashSet listeHash = new HashSet(listeChaine);
		
		// J'ajoute plusieurs �lements dans ma liste.
		// Les �lements � ajout� sans stock�s dans une autre liste.
		listeHash.addAll(listeChaine);
		
		// Je cr�� une nouvelle variable de type ArrayList...
		// ... et je cr�� un nouvel objet (ArrayList) qui prend des
		// valeurs par d�faut.
		ArrayList tableaATrier = new ArrayList(listeHash);
		
		// J'appelle la fonction 'sort' disponible dans la classe Collections
		// Cette fonction me trie mon tableau.
		Collections.sort(tableaATrier);
		System.out.println(tableaATrier);
		
		TreeSet listeTriAuto = new TreeSet(listeChaine);
		System.out.println(listeTriAuto);
		TestCollection.testerLesCollections();

		
		decouvrirSwitch();
	}

	/**
	 * Afficher les N premiers �l�ments d'une liste chain�e de chaine de caract�res.
	 * 
	 * @param listeChaine
	 *            Liste chain�es.
	 * @param i
	 *            Nombre d'�lement � afficher.
	 */
	private static void afficherLesNPremiersElementsDansListe(LinkedList<String> listeChaine, int i) {
		for (int index = 0; index < i; index++) {
			System.out.println(listeChaine.get(index));
		}
	}

	/**
	 * On afie le dernere �lement d'une liste.
	 * @param listeChaine
	 */
	private static void afficherDernierElementDansListe(LinkedList<String> listeChaine) {
		System.out.println("J'affiche le ferniere �lement :" + listeChaine.get(listeChaine.size() - 1));
	}

	/**
	 * On affiche la liste en utilisant un iterateur.
	 * @param listeChaine La liste � afficher.
	 */
	private static void afficherListeAvecIterateur(LinkedList<String> listeChaine) {
		Iterator<String> iterateur = listeChaine.iterator();

		// J'utilie l'iterateur et sa fonction hasNext pour v�rifier si
		// l'�mement suivant existe.
		while (iterateur.hasNext()) {
			// J'affiche l'�l�ment suivant.
			System.out.println(iterateur.next());
		}
	}

	/**
	 * On affiche une liste en utilisant un ForEach.
	 * @param listeChaine La liste � afficher.
	 * @return Code de retour.
	 */
	private static int affciherListeAvecForEach(LinkedList<String> listeChaine) {
		System.out.println("\nAffichage des pr�noms avec la boble ForEach.");
		// Pour chaque �lement de la liste...
		for (String prenom : listeChaine) {
			// J'affiche l'�l�ment.
			System.out.println(prenom);
		}
		return 0;
	}

	/**
	 * On utilise une fonction pour d�couvrir l'utilsation du Switch.
	 */
	private static void decouvrirSwitch() {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Entrez un age : ");
		int age = clavier.nextInt();
		
		String etatPersonne = null;
		
		if (age == 0) {
			etatPersonne = "Rien";
		}
		else if (age < 3) {
			etatPersonne = "B�b�";
		}
		else if (age < 12) {
			etatPersonne = "Enfant";
		}
		else if (age < 18) {
			etatPersonne = "Ados";
		}
		else if (age < 31) {
			etatPersonne = "Jeune";
		}
		else if (age < 50) {
			etatPersonne = "Adulte";
		}
		else if (age < 60) {
			etatPersonne = "Vieux";
		}
		else if (age < 100) {
			etatPersonne = "Senior";
		}
		else if (age < 1000) {
			etatPersonne = "Momie";
		}
		else {
			etatPersonne = "Dinosaure";
		}
		System.out.println("Etat de la personne : " + etatPersonne);
		
		switch (etatPersonne) {
		case "Rien":
			System.out.println("Ce truc ne peut pas parler.");
			break;
		case "B�b�":
			System.out.println("Areuh argh reu.");
			break;

		case "Enfant":
			System.out.println("Poukoi ?");
			break;

		case "Ados":
			System.out.println("Wesh maggle ca fart ?!");
			break;

		case "Jeune":
			System.out.println("On est juste parfait !");
			break;

		case "Adulte":
			System.out.println("Fait chier...");
			break;

		case "Vieux":
			System.out.println("J'ai mal... Monde de ... Tous nul !");
			break;

		case "Senior":
			System.out.println("Ma machoire est tomb�e...");
			break;

		case "Momie":
			System.out.println("... Gnnnnnn...");
			break;

		default:
			System.out.println("Rrrrrrrrrrrh !");
			break;
		}
		
		switch (age) {
		case 0:
			System.out.println("Ce ne truc ne peut ps parler.");
			break;
		case 1:
		case 2:
			System.out.println("Areare");
			break;

		default:
			switch (age) {
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				System.out.println("Enfant Poukoi ?");
				break;
			default:
				System.out.println("C'est vraiment trop chiant...");
				break;
			}
			break;
		}
		
	}
	
}
