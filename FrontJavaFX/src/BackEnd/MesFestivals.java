package BackEnd;

import java.util.ArrayList;
import java.util.Collection;
import java.io.IOException;

public class MesFestivals {
	
	ArrayList<Festival> mes_festivals = new ArrayList<Festival>();
	
	
	public MesFestivals() throws IOException{
		//mes_festivals.add(festival1);
		//mes_festivals.add(festival2);

	}

	public void supprimer(Festival f) {
		mes_festivals.remove(f);
	}
	
	public void ajouter(Festival f) {
		mes_festivals.add(f);
	}
	
	

	@Override
	public String toString() {
		return "" + mes_festivals + "";
	}


	

	
}
