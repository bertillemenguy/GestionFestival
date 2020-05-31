package BackEnd;
import java.io.Serializable;


public class Restaurant extends Stand implements Serializable{

	public Restaurant (int nb, int x, int y, int tx, int ty, float cout) {
		super (nb,x,y,tx,ty,cout);
	}

	
}
