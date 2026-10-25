package problem3;


import java.util.ArrayList;

public class Library {
    private int capacity ;
    private ArrayList<Document> Documents  =  new ArrayList<>()  ;


    Library( int c ) {
        this.capacity =  c ;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean add(Document d) {
        if (this.Documents.size() == this.capacity) {
            System.out.println("Out of capacity!");
            return false ;
        }

        this.Documents.add(d) ;

        return true ;
    }

    public boolean delete(Document doc) {
        for ( Document d  : this.Documents) {
            if (d == doc) {
                this.Documents.remove(d) ;
                return true ;

            }
        }

        return false ;
    }

    public void displayDocuments() {
        for ( int i= 0 ; i< this.Documents.size()  ; i++) {
            System.out.println(this.Documents.get(i));
        }
    }

    Document document(int numEnrg) {

        for ( Document d :  this.Documents) {
            if ( d.numRec == numEnrg) {
                return d  ;

            }
        }

        return null;

    }

    public void displayAuthors() {
        for ( Document d  : this.Documents) {
            if ( d instanceof Book) {
                System.out.println(((Book) d).author) ;

            }
        }
    }

    public String toString() {
        return "Library : " + "capacity =  " + this.capacity + " \n"
                            + " Documents : " + this.Documents + "\n" ;
    }
}
