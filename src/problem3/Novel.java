package problem3;

public class Novel extends Book{
    public double price ;

    Novel(String title , int nbrPages , double price) {
        super(title , nbrPages) ;
        this.price  =  price;
    }


    public String toString() {

        return "Novel : " + "price  : " + this.price + "\n" ;
    }
}
