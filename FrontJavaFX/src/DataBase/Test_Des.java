package DataBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import BackEnd.Festival;

public class Test_Des {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("../DataSer/Festival.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Festival festival1 = (Festival) ois.readObject();
			Festival festival2 = (Festival) ois.readObject();
		
		
			
			System.out.println( festival1 );
			System.out.println( festival2 );
			

			

			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
