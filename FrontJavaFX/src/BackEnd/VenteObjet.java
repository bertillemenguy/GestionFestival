package BackEnd;
import java.io.Serializable;


public class VenteObjet extends Stand implements Serializable{

	public VenteObjet (int nb, int x, int y, int tx, int ty, float cout) {
		super (nb,x,y,tx,ty,cout);
	}
}

