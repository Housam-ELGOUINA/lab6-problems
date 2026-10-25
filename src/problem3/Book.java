package problem3;

public class Book extends Document{

    protected String author ;
    protected int nbrPages ;

    Book(String name , int nbrPages) {
        super( 1 , "Book") ;
        this.author =  name ;
        this.nbrPages =  nbrPages ;
    }


    public String toString() {
         return "Book : " +" author : "  + this.author + "\n"
                + " pages number : " + this.nbrPages + "\n" ;
    }
}
