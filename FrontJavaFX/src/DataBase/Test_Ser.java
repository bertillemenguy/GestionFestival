package DataBase;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import BackEnd.Date;
import BackEnd.Emplacement;
import BackEnd.Festival;

import java.io.FileNotFoundException;

public class Test_Ser {

	public static void main(String[] args) {
		
		Date date1= new Date("18","07","2019");
		Date date2= new Date("05","07","2019");
		
		Festival festival1 = new Festival("Vielles Charrues 2019", date1, 4);
		Festival festival2 = new Festival("Bobital 2019", date2, 2); 

		
		try {
			FileOutputStream fos = new FileOutputStream("../DataSer/Festival.txt");
			ObjectOutputStream os = new ObjectOutputStream(fos); 
			os.writeObject(festival1);
			os.writeObject(festival2);
			

			System.out.println("Object sérialisé");
			os.close();
			System.out.println("Fermeture");
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}

}
