package problem3;

public class TextBook extends Book{
    public String level ;

    TextBook(String name  , int nbrPaes  , String level) {
        super(name , nbrPaes) ;


        this.level  = level ;
    }


}
