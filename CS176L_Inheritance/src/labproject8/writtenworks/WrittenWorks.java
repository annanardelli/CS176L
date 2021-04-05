/**
 * Superclass
 * Sets and gets title, author, and year
 */

package labproject8.writtenworks;

public class WrittenWorks {

//Instance variables
 private String title;
 private String author;
 private int year;


 // constructors:
 public WrittenWorks(String title, String author, int year) {

     setTitle( title );
     setAuthor( author );
     setYear( year );
 }

 public WrittenWorks() {
 }


 // accessor methods:
 public String getTitle() {
     return title;
 }

 public String getAuthor() {
     return author;
 }

 public int getyear() {
     return year;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public void setAuthor(String author) {
     this.author = author;
 }

 public void setYear(int year)
 {
     this.year = year;
 }

@Override
public String toString() {
	return "Title: " + title + ", Author: " + author + ", Year Published: " + year;
}
 
} // end class

