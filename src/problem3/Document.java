package problem3;

public class Document {
    protected int numRec ;

    protected String title ;

    Document(int n  , String title) {
        this.numRec =  n ;
        this.title =   title ;
    }

    public String toString() {
        return "Document : " + " numRec " + this.numRec + "\n"
                + "title : " + this.title + "\n ";
    }

}


