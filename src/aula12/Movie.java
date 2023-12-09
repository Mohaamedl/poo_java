package aula12;

public class Movie implements Comparable<Movie> {
    protected String name, rating, genre;
    protected double score;
    protected int runningTime;
    public Movie(String name, double score, String rating, String genre,int runningTime){
        this.name=name;
        this.rating=rating;
        this.genre=genre;
        this.score=score;
        this.runningTime=runningTime;
    }
    public String getGenre() {
        return genre;
    }
    public String getName() {
        return name;
    }
    public String getRating() {
        return rating;
    }
    public int getRunningTime() {
        return runningTime;
    }
    public double getScore() {
        return score;
    }
    
    public String toString() {

        return String.format("%40s%10.1f%12s%12s%15d",name,score,rating,genre,runningTime);
    }
    
    public boolean equals(Object obj) {
        if  (this == obj) return true;
        if (obj==null) return false;
        if (getClass()!= obj.getClass()) return false;
        Movie outro = (Movie) obj;
        if( !outro.name.equals(this.name)||outro.score!=this.score||!outro.rating.equals(this.rating)||!outro.genre.equals(this.genre)||outro.runningTime!=this.runningTime) return false;
        return true;
    }
    public int hashCode() {
        int h = 3;
        h = 53*h+ (this.name!=null? this.name.hashCode():0);
        h = 53*h+  (int) score;
        h = 53*h+ (this.rating!=null? this.rating.hashCode():0);
        h = 53*h+ (this.genre!=null? this.genre.hashCode():0);
        h = 53*h+ runningTime; 
        return h;
    }
    public int compareTo(Movie obj){
        int c = this.name.compareToIgnoreCase(obj.name);
        
        return c;


    }


}
