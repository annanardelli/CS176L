/**
 * Subclass of WrittenWork
 * Sets and gets genre, chapters
 */

package labproject8.writtenworks;

public class Novel extends WrittenWorks {

	//Instance variables
	public String genre;
	private int chapters;

 // constructors:
 public Novel(String title, String author, int year, String genre, int chapters) {
     super(title, author, year);
     setGenre( genre );
     setChapters( chapters );
 }

 // accessor methods:
 public String getGenre() {
     return genre;
 }

 public int getChapters() {
     return chapters;
 }

 public void setGenre(String genre) {
     this.genre = genre;
 }

 public void setChapters(int chapters) {
     this.chapters = chapters;
 }

@Override
public String toString() {
	return super.toString() + ",\nGenre: " + genre + ", " + chapters + " Chapters";
}

} // end class
