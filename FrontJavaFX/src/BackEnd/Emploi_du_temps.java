package BackEnd;

import java.io.Serializable;


import java.util.ArrayList;
import java.util.Scanner;

public class Emploi_du_temps implements Serializable{

	private ArrayList<Representation> lesRepresentations;

	public Emploi_du_temps() {
		lesRepresentations = new ArrayList<Representation>();

	}

	public void ajouter() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Cration d'une reprsentation :");
		System.out.println(" > Heure de dbut :");
		double heureD = sc.nextDouble();
		System.out.println(" > Heure de fin :");
		double heureF = sc.nextDouble();
		System.out.println(" > Genre de la reprsentation :");
		String genre = sc.next();

		Representation rep = new Representation(heureD, heureF, genre);

		lesRepresentations.add(rep);

		sc.nextLine();
	}

	public void modifier() {

		if(!this.estVide()) {
			Representation modifRep = getRepresentation();
			if (modifRep != null) {

				int choix = 0;
				System.out.println("1) Ajouter artiste\n2) Supprimer artiste\n3) Modifier artiste\n4) Modifier genre");
				System.out.println("\nTapez 0 pour annuler");

				Scanner sc = new Scanner(System.in);
				choix = sc.nextInt();
				boolean stop = false;
				while (!stop && (choix < 0 || choix > 3)) {
					System.out.println("Choix incorrect");
					System.out.println(
							"1) Ajouter artiste\n2) Supprimer artiste\n3) Modifier artiste\n4) Modifier genre");
					System.out.println("\nTapez 0 pour annuler");

					sc.nextLine();
					choix = sc.nextInt();

				}

				if (choix == 0) {
					stop = true;
					System.out.println("Modification annule");
				} else if (choix == 1) {
					modifRep.ajouterArtiste();
				} else if (choix == 2) {
					modifRep.supprimerArtiste();
				} else if (choix == 3) {
					modifRep.modiferArtiste();
				} else if (choix == 4) {
					modifRep.modifierGenre();
					System.out.println(modifRep.toString());
				}
			}

		} else {
			System.out.println("Aucune reprsentation enregistre !");
		}

	}

	public void verifGenre() {

	}

	public void verifHoraire() {

	}

	public Representation getRepresentation() {

		Representation rep = null;
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		boolean stop = false;

		if (!this.estVide()) {

			// future bouton annuler modification
			this.consulter();
			System.out.println("Tapez 0 pour annuler");

			numero = sc.nextInt();
			while (stop == false && (numero > lesRepresentations.size() || numero <= 0)) {
				// clear buffer
				sc.nextLine();

				if (numero == 0) {
					stop = true;
					System.out.println("Modification annule");
				} else {
					System.out.println("Choix incorrect !");
					this.consulter();
					numero = sc.nextInt();
				}
			}

			if (numero > 0) {
				rep = lesRepresentations.get(numero - 1);
			}

		}

		return rep;
	}

	public void consulter() {

		if (!this.estVide()) {
			System.out.println("Liste des reprsentations :");
			for (int i = 0; i < lesRepresentations.size(); i++) {
				System.out.println("\n" + (i + 1) + ")\n" + lesRepresentations.get(i).toString());
			}

		}

	}

	private boolean estVide() {
		return lesRepresentations.size() == 0;
	}

	public void supprimer() {
		if (!this.estVide()) {
			lesRepresentations.remove(this.getRepresentation());
		} else {
			System.out.println("Aucune reprsentation");
		}
	}

}
