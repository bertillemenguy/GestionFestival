package BackEnd;

import java.io.Serializable;

public class Emplacement implements Serializable{

	private float taille;
	private String ville;
	private float prix_terrain;
	private float distance_habitation;
	private float distance_commerce;
	
	
	public Emplacement(float taille, String ville, float prix_terrain, float distance_habitation, float distance_commerce) {
		this.taille=taille;
		this.ville=ville;
		this.prix_terrain=prix_terrain;
		this.distance_habitation=distance_habitation;
		this.distance_commerce=distance_commerce;
	}


	@Override
	public String toString() {
		return "Emplacement [taille=" + taille + ", ville=" + ville + ", prix_terrain=" + prix_terrain
				+ ", distance_habitation=" + distance_habitation + ", distance_commerce=" + distance_commerce + "]";
	}


	public float getTaille() {
		return taille;
	}


	public void setTaille(float taille) {
		this.taille = taille;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public float getPrix_terrain() {
		return prix_terrain;
	}


	public void setPrix_terrain(float prix_terrain) {
		this.prix_terrain = prix_terrain;
	}


	public float getDistance_habitation() {
		return distance_habitation;
	}


	public void setDistance_habitation(float distance_habitation) {
		this.distance_habitation = distance_habitation;
	}


	public float getDistance_commerce() {
		return distance_commerce;
	}


	public void setDistance_commerce(float distance_commerce) {
		this.distance_commerce = distance_commerce;
	}
	
	/* 
		Emplacement emplacement1= new Emplacement(54, "Carhaix", 100000, 100, 100);
		Emplacement emplacement2= new Emplacement(30, "Dinan", 20000, 50, 50);
		 */
	
	
}
