public class Movie {
    private String Title;
    private double Duration; 
    private int rating; 
public Movie(String t, Double a)
  {
    Title = t;
    Duration = a;
    rating = 0;
  }
public String getTitle(){
    return Title;
}
public Double getDuration(){
    return Duration;

}
public int getRating(){
    return rating;

}
public int adjustRating(int newRating){
    rating = newRating;
    return rating;
}
public String toString(){
    String info = Title + "runs for" + Duration;
    if(rating != 0){
        info += ",rating is" + rating;
    }
    return info;
}
public void setTitle(String t){
    Title = t;
}
public void setDuration(Double a){
    Duration = a;

}

}

