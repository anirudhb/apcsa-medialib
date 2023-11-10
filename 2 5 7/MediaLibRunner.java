/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to your Media Library");
    MediaLib myLib = new MediaLib();
    Book myBook = new Book("The Lord of the Rings ",  "Tolkien");
    System.out.println("Book created " + myBook);
    myLib.addBook(myBook);
    int myRating = 5;
    myBook.adjustRating(myRating);
    System.out.println(myBook);
    myBook.setTitle("New book title");
    System.out.println("Book:" + myBook);
    System.out.println("Library: " + myLib);
    System.out.println("You have a NEW Library");
    MediaLib myLib2 = new MediaLib();

    Book newBook = new Book("To Kill a Mockingbird", "Lee");
    myLib2.addBook(newBook);
    System.out.println(myLib2);
    newBook = new Book("1984", "Orwell");
    System.out.println(myLib2);

    System.out.println(myLib2.equals(myBook));

    System.out.println("everything below is testing for movie:");
    
    Movie myfavoriteMovie = new Movie("The Pursuit of Happyness", 1.95);
    Movie otherMovie = new Movie("Star wars", 2.54);
    Movie mySameMovie = new Movie("The Pursuit of Happyness", 1.95);
    MediaLib myLib3 = new MediaLib();
    myLib3.addMovie(myfavoriteMovie);
   System.out.println(myLib3.movieEquals(mySameMovie)); // True
   System.out.println(myLib3.equals(otherMovie)); // False
    //System.out.println(myfavoriteMovie.equals(otherMovie));
    //System.out.println(myfavoriteMovie.equals(mySameMovie));
  }
} 