/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib
{
  /* book  */
  private Book book2;

  public void addBook(Book b)
  {
    book2 = b;
  }

  
  public boolean equals(Book b){
    if(((book2.getAuthor()).equals(b.getAuthor())) && ((book2.getTitle()).equals(b.getTitle()))){
      return true;

    }
    return false; 

  }
  public static void main (String[] args){

      System.out.println("test");

  }
  /*movie */
  private Movie myMovie;

  public void addMovie(Movie m){
    myMovie = m;
  }
  public String toString() 
  {
    String info = "the book in the library is:" + book2 + " and the movie in the library is: " + myMovie; 
    
    return info;
  }
  public boolean movieEquals(Movie m){
      if(((myMovie.getTitle()).equals(m.getTitle())) && ((myMovie.getDuration()).equals(m.getDuration()))){
        
        return true;
      }
      return false; 
  }
  
}