package BackEnd;import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainFestival {
		
	public static void main(String[] args) throws IOException{	
	
		
		MesFestivals mon_espace= new MesFestivals();


/* menu */ 
		
			System.out.println("Bonjour, bienvenue sur la gestion de festival\n");
	
			System.out.println("1- Accéder à un festival existant");
			System.out.println("2- Créer un festival");

			BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));			
			System.out.println("\nFaites votre choix :");
			String src = entree.readLine();	 
			int i; 
			i = Integer.parseInt(src); 	
			switch(i) {
			  case 1:
				  System.out.println(mon_espace.toString());
				  break;
			    
			  case 2:
				  				  
				  System.out.println("Nom du festival :");
				  	BufferedReader nom = new BufferedReader(new InputStreamReader(System.in));		
					String n = nom.readLine();	 
				  System.out.println("Ville:");
				  	BufferedReader ville = new BufferedReader(new InputStreamReader(System.in));		
					String v = ville.readLine();
					
				System.out.println("Date du début:");
				 System.out.println("jour"); 	
				BufferedReader jour = new BufferedReader(new InputStreamReader(System.in));		
					String j = jour.readLine();
					 System.out.println("mois"); 	
					BufferedReader mois = new BufferedReader(new InputStreamReader(System.in));		
					String m = mois.readLine();
					 System.out.println("annee"); 	
					BufferedReader annee = new BufferedReader(new InputStreamReader(System.in));		
					String a = annee.readLine();
										
					
				  System.out.println("Durée:");
				  	BufferedReader duree = new BufferedReader(new InputStreamReader(System.in));		
					String d = duree.readLine();
					int D; 
					D = Integer.parseInt(d); 
					
					
				  System.out.println("Prix total du terrain :");
				  	BufferedReader prix =new BufferedReader(new InputStreamReader(System.in));		
					String p = prix.readLine();
					int P; 
					P = Integer.parseInt(p); 
					
				  System.out.println("Taille:");
				  	BufferedReader taille = new BufferedReader(new InputStreamReader(System.in));		
					String t = taille.readLine();
					int T; 
					T = Integer.parseInt(t); 
					
				System.out.println("Distance du festival avec l'habitation la plus proche:");
					 BufferedReader dhab = new BufferedReader(new InputStreamReader(System.in));		
					 String dh = dhab.readLine();
					 int DH; 
						DH = Integer.parseInt(dh); 
					 
				System.out.println("Distance du festival avec le commerce le plus proche:");
					 BufferedReader dcom = new BufferedReader(new InputStreamReader(System.in));		
					 String dc = dcom.readLine();
					 int DC; 
						DC = Integer.parseInt(dc); 
					 
					 Date date = new Date(j,m,a);
					 Emplacement emplacement = new Emplacement(T, v, P, DH, DC);
					 Festival festival = new Festival(n, date, D);
				  
			    break;
			    
			  default:
				  System.out.println("Impossible");
			}
	
		}
	

	
	}
