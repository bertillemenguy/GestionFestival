package BackEnd;

import java.io.Serializable;

	
public abstract class Stand implements Serializable{

	private int nb;
	private float taille_x;
	private float taille_y;
	private float cout;
	private int pos_x;
	private int pos_y;
	
	public Stand(int nb, int x, int y, float taille_x, float taille_y, float cout) {
		this.nb=nb;
		this.pos_x = x;
		this.pos_y = y;
		this.taille_x=taille_x;
		this.taille_y=taille_y;
		this.cout=cout;
	}

	@Override
	public String toString() {
		return "Stand [nb=" + nb + ", taille_x=" + taille_x + ", taille_y=" + taille_y + ", cout=" + cout + "]";
	}

	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}

	public float getTaille_x() {
		return taille_x;
	}

	public void setTaille_x(float taille_x) {
		this.taille_x = taille_x;
	}

	public float getTaille_y() {
		return taille_y;
	}

	public void setTaille_y(float taille_y) {
		this.taille_y = taille_y;
	}

	public float getCout() {
		return cout;
	}

	public void setCout(float cout) {
		this.cout = cout;
	}

	public int getPos_x() {
		return pos_x;
	}

	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}

	public int getPos_y() {
		return pos_y;
	}

	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
	

	
}
