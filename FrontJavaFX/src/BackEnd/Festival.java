package BackEnd;
import java.io.Serializable;

import java.io.Serializable;


public class Festival implements Serializable{

	
	public Festival(String nom, Date date, int duree) {
		
		this.nom=nom;
		this.date=date;
		this.duree=duree;
		
	}
	
	
	private String nom;
	private Date date;
	private int duree;
	
	
	
	
	@Override
	public String toString() {
		return "Festival [nom=" + nom + ", date=" + date + ", duree=" + duree + "]";
	}
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	
	
	
	
}
