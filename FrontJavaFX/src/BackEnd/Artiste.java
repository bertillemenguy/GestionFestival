package BackEnd;

import java.io.Serializable;


public class Artiste implements Serializable {
	
	private String nom;
	private double prix;
	
	
	public Artiste(String n, double p) {
		this.nom = n;
		this.prix = p;
	}
	

	public String toString() {
		
		String chaine = "";
		
		chaine += "\n|   > Nom : " + nom;
		chaine += "\n|   > Prix : " + prix;
		
		return chaine;
	}
	
	public String getNomArtiste() {
		return this.nom;
	}
	
	public double getPrixArtiste() {
		return this.prix;
	}


	public void setNom(String new_nom) {
		this.nom = new_nom;
	}


	public void setPrix(double new_prix) {
		this.prix = new_prix;
	}
}
