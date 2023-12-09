package exercicio_aula11;



public class Book implements Comparable<Book> {
    protected String title;
    protected String pubYear;
    protected String isbn;
    protected String aut;

    public Book(String title,String aut, String pubYear){
        try{ this.title=title;
        this.pubYear=pubYear;
        this.aut=aut;}
        catch(Exception e){}
       
    }
   
    public String getTitle() {
        return title;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getPubYear() {
        return pubYear;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPubYear(String pubYear) {
        this.pubYear = pubYear;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String toString(){
        return String.format("\"%s\",by %s (%s)\n",title,aut,pubYear);
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null) return false;
        if(this.getClass()!=obj.getClass()) return false;
        Book outro = (Book) obj;
        if(outro.aut!=this.aut||outro.pubYear!=this.pubYear||outro.title!=this.title) return false;
        return true;
    }
    @Override
    public int hashCode() {
        int hash = 3;
        hash=hash*53 +(title!=null? title.hashCode():0);
        hash=hash*53 +(aut!=null? aut.hashCode():0);
        hash=hash*53 +(pubYear!=null? pubYear.hashCode():0);
        return hash;
    }
    @Override
    public int compareTo(Book o) {
        
        return this.title.compareTo(o.title);
    }

 

    
}
