package BackEnd;

import java.io.Serializable;


public class Toilettes extends Stand implements Serializable{
	
	public Toilettes (int nb, int x, int y, int tx, int ty, float cout) {
		super (nb,x,y,tx,ty,cout);
	}
}

