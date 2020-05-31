package BackEnd;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.Serializable;


public class Representation implements Serializable{

	private double heureDebut;
	private double heureFin;

	// private Artiste monArtiste = null;

	private GenreMusical monGenre = null;

	private ArrayList<Artiste> lesArtistes;

	public Representation(double debut, double fin, String g) {
		this.heureDebut = debut;
		this.heureFin = fin;
		this.lesArtistes = new ArrayList<Artiste>();

		this.monGenre = new GenreMusical(g);

		Scanner sc = new Scanner(System.in);

		System.out.println("Cration de l'artiste principale :");
		System.out.println(" > Nom de l'artiste :");
		String nom = sc.next();

		System.out.println(" > Prix de l'artiste :");
		double prix = sc.nextDouble();

		lesArtistes.add(new Artiste(nom, prix));

		sc.nextLine();
	}

	public void modiferArtiste() {

		if (!lesArtistes.isEmpty()) {

			System.out
					.println("Modification : \n1) Nom\n2) Prix\n3) Heure de debut\n4) Heure de fin\n5) Genre musical");
			System.out.println("\nTapez 0 pour annuler");
			int choix = 0;
			boolean stop = false;
			Scanner sc = new Scanner(System.in);

			while (!stop) {
				choix = sc.nextInt();

				stop = true;
				switch (choix) {

				case 1:
					for (int i = 0; i < lesArtistes.size(); i++) {
						System.out.println(lesArtistes.get(i).toString());
					}
					System.out.println("Entrez le nouveau nom :");
					lesArtistes.get(0).setNom(sc.next());
					break;
				case 2:
					System.out.println("Entrez le nouveau prix :");
					lesArtistes.get(0).setPrix(sc.nextDouble());
					break;
				case 3:
					System.out.println("Entrez la nouvelle heure de debut :");
					this.heureDebut = sc.nextDouble();
					break;
				case 4:
					System.out.println("Entrez la nouvelle heure de fin :");
					this.heureFin = sc.nextDouble();
					break;
				case 5:
					// monArtiste.setGenreMusical();
					break;
				case 0:
					stop = true;
					System.out.println("Modification annule");
					break;
				default:
					System.out.println("Choix incorrect");
					System.out.println(
							"Modification :\n1) Nom\n2) Prix\n3) Heure de debut\n4) Heure de fin\n5) Genre musical");
					System.out.println("\nTapez 0 pour annuler");
					stop = false;
					break;

				}

			}
		} else {
			System.out.println("Aucun artiste");
		}

	}

	public Artiste getArtiste() {

		Artiste art = null;
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		boolean stop = false;

		if (!this.estVide()) {

			// future bouton annuler modification
			this.consulter();
			System.out.println("Tapez 0 pour annuler");

			numero = sc.nextInt();
			while (stop == false && (numero > lesArtistes.size() || numero <= 0)) {
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
				art = lesArtistes.get(numero - 1);
			}

		}

		return art;
	}

	private boolean estVide() {
		return lesArtistes.size() == 0;
	}

	public void consulter() {

		if (!this.estVide()) {
			System.out.println("Liste des artistes :");
			for (int i = 0; i < lesArtistes.size(); i++) {
				System.out.println("\n" + (i + 1) + ")\n" + lesArtistes.get(i).toString());
			}

		}

	}

	public void modifierGenre() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nouveau genre de la reprsentation :");
		String newGenre = sc.next();

		this.monGenre.setGenre(newGenre);
	}

	public String toString() {

		String chaine = "";
		if (!lesArtistes.isEmpty()) {
			for (int i = 0; i < lesArtistes.size(); i++) {
				chaine += "| > Artiste : " + (i + 1) + " " + lesArtistes.get(i).toString() + "\n";
			}
			chaine += "| > Heure de debut : " + heureDebut;
			chaine += "\n| > Heure de fin : " + heureFin;
		}

		if (monGenre != null) {
			chaine += "\n| > Genre musical : " + monGenre.getGenre() + "\n";
		}

		return chaine;
	}

	public void ajouterArtiste() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cration d'un artiste :");
		System.out.println(" > Nom de l'artiste :");
		String nom = sc.next();

		System.out.println(" > Prix de l'artiste :");
		double prix = sc.nextDouble();

		lesArtistes.add(new Artiste(nom, prix));

	}

	public void supprimerArtiste() {

		if (lesArtistes.size() > 1) {
			lesArtistes.remove(this.getArtiste());
		} else {
			System.out.println("Il ne reste qu'un artiste");
		}

	}
}
