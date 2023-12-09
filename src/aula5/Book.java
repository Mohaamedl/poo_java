package aula5;


public class Book {
    private String title;
    private int pubYear;
    private String isbn;

    public Book(String title, int pubYear, String isbn){
        this.title=title;
        this.pubYear=pubYear;
        this.isbn=isbn;
    }
    public Book(String title, int pubYear){
        this.title=title;
        this.pubYear=pubYear;
    }
    public Book(String title){
        this.title=title;
    }
    String getTitle(){
        return title;
    }
    String getISBN(){
        return isbn;
    }
    void setISBN(String isbn){
        this.isbn=isbn;  
    }
    public String toString(){
        return String.format("Title: %s    PubYear: %d    ISBN: %s",title,pubYear,isbn);
    }

 

    
}
