package BackEnd;

import java.io.Serializable;


public class GenreMusical implements Serializable{

	
	private String genre; 
	
	public GenreMusical(String g) {
		this.genre = g;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String newGenre) {
		
		this.genre = newGenre;
	}
}

