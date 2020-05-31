package BackEnd;

import java.util.Scanner;
import java.io.Serializable;


public class Facture implements Serializable{

	
	private float recette;
	private float benefice;
	private float depense;
	
	private String listedepense ="";
	private String listerecette ="";
	
	private float tarif_enfant;
	private float tarif_jeune;
	private float tarif_adulte;
	private float tarif_camping;
	
	private int nb_entre_enfant;
	private int nb_entre_jeune;
	private int nb_entre_adulte;
	private int nb_entre_camping;
	
	private float tarif;
	
	private float prvu_bar;
	private float prvu_venteobjet;
	private float prvu_restaurant;
	
	private float prvu_stand;
	
	private static Scanner sc = new Scanner(System.in);
	
    public Facture(float r, float b, float d, float t, float te, float tj, float ta, float tc, int nee, int nej, int nea, int nec) {

        this.recette = r;
        this.benefice = b;
        this.depense = d;
        this.tarif = t;
        while(!listedepense.equals("*")) {
        	System.out.println("Liste dpenses ?");
        	this.listedepense = sc.next();
        }
        while(!listerecette.equals("*")) {
        	System.out.println("Liste recettes ?");
        	this.listerecette = sc.next();
        }
        
        System.out.println("Gain prvu pour bar ?");
        this.prvu_bar = sc.nextInt();
        System.out.println("Gain prvu pour ventes d'objets ?");
        this.prvu_venteobjet = sc.nextInt();
        System.out.println("Gain prvu pour restaurant ?");
        this.prvu_restaurant = sc.nextInt();
        
        System.out.println("Tarif enfant ?");
        this.tarif_enfant = sc.nextInt();
        System.out.println("Tarif jeune ?");
        this.tarif_jeune = sc.nextInt();
        System.out.println("Tarif adulte ?");
        this.tarif_adulte = sc.nextInt();
        System.out.println("Tarif camping ?");
        this.tarif_camping = sc.nextInt();
        System.out.println("Nombre d'entrer enfant ?");
        this.nb_entre_enfant = sc.nextInt();
        System.out.println("Nombre d'entrer jeune ?");
        this.nb_entre_jeune = sc.nextInt();
        System.out.println("Nombre d'entrer adulte ?");
        this.nb_entre_adulte = sc.nextInt();
        System.out.println("Nombre d'entrer camping ?");
        this.nb_entre_camping = sc.nextInt();
       
    }
    
    public float getRecette() {
    	recette = benefice-depense;
        return recette;
    }
    public float getBenefice() {
    	benefice = tarif + prvu_stand;
        return benefice;
    }
    public float getDepense() {
        return depense;
    }
    public float getTarif() {
    	tarif = (tarif_enfant*nb_entre_enfant)+(tarif_jeune*nb_entre_jeune)+(tarif_adulte*nb_entre_adulte)+(tarif_camping*nb_entre_camping);
    	return tarif;
    }
    
    public float getPrvu_bar() {
        return prvu_bar;
    }
    public float getPrvu_venteobjet() {
        return prvu_venteobjet;
    }
    public float getPrvu_restaurant() {
        return prvu_restaurant;
    }
    public float getPrvu_stand() {
    	prvu_stand = prvu_bar + prvu_venteobjet + prvu_restaurant;
    	return prvu_stand;
    }
    
    public String getListedepense() {
        return listedepense;
    }
    public String getListerecette() {
        return listerecette;
    }
    
    public float getTarif_enfant() {
        return tarif_enfant;
    }    
    public float getTarif_jeune() {
        return tarif_jeune;
    }
    public float getTarif_adulte() {
        return tarif_adulte;
    }
    public float getTarif_camping() {
        return tarif_camping;
    }
    
    public int getNb_entre_enfant() {
    	return nb_entre_enfant;
    }
    public int getNb_entre_jeune() {
    	return nb_entre_jeune;
    }
    public int getNb_entre_adulte() {
    	return nb_entre_adulte;
    }
    public int getNb_entre_camping() {
    	return nb_entre_camping;
    } 
    
    
        
    public String toString() {
        String chaine = " > Tarif enfant : " + this.tarif_enfant + " x " + this.nb_entre_enfant +" = " +this.tarif_enfant*this.nb_entre_enfant;
        chaine += "\n > Tarif jeune : " + this.tarif_jeune + " x " + this.nb_entre_jeune +" = " +this.tarif_jeune*this.nb_entre_jeune;
        chaine += "\n > Tarif adulte : " + this.tarif_adulte + " x " + this.nb_entre_adulte +" = " +this.tarif_adulte*this.nb_entre_adulte;
        chaine += "\n > Tarif camping : " + this.tarif_camping + " x " + this.nb_entre_camping +" = " +this.tarif_camping*this.nb_entre_camping;
        chaine += "\n > Obtenu par les entres : " + this.getTarif();
        chaine += "\n > Gain prvu avec stands : " + this.getPrvu_stand();
        chaine += "\n > Liste dpenses : " + this.listedepense;
        chaine += "\n > Liste recettes : " + this.listerecette;
        chaine += "\n > Bnfices : " + this.getBenefice();
        chaine += "\n > Dpenses : " + this.depense;
        chaine += "\n > Recettes : " + this.getRecette();
        return chaine;
    }
    public void afficher() {
    	System.out.println(this.toString());
    } 

	
}
