package problem3;

public class Dictionary extends Document {
    private String language  ;

    Dictionary(int n , String title ,String lang ) {
        super(n , title) ;
        this.language =  lang ;

    }
    @Override
    public String toString() {
        return "Dictionary { title  : " + this.title+ "\n" +
                            "number of rep : " + this.numRec + "\n" +
                                " Language : " + this.language + "\n" ;
    }
}
