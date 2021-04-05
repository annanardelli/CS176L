/**
 * Subclass of WrittenWork
 * Sets and gets genre, paragraphs,
 * and whether the story has pictures
 */
package labproject8.writtenworks;

public class ShortStory extends WrittenWorks {
	
	//Instance variables
	String genre;
	int paragraphs;
	boolean hasPics = false;
	String hasPictures;

	//Constructor
	public ShortStory (String title, String author, int year,
			String genre, int paragraphs, boolean hasPics) {
		
		super(title, author, year);
		
		setGenre(genre);
		setParagraphs(paragraphs);
		setHasPics(hasPics);
		
	}
	
	//accessor methods
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setParagraphs(int paragraphs) {
		this.paragraphs = paragraphs;
	}
	
	public void setHasPics(boolean hasPics) {
		this.hasPics = hasPics;
		if (hasPics == true) {
			hasPictures = "Has";
		}
		else {
			hasPictures = "No";
		}
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getParagraphs() {
		return paragraphs;
	}
	
	public boolean isHasPics() {
		return hasPics;
	}

	@Override
	public String toString() {
		return super.toString() + ",\nGenre: " + genre + ", " + paragraphs +
				" Paragraphs, " + hasPictures + " Pictures";
	}

	

}
