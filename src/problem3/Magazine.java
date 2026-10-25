package problem3;

public class Magazine extends Document{
    private String month ;
    private int year ;

    Magazine(int n , String title  , String month , int year) {
        super(n ,title) ;
        this.month=  month ;
        this.year =  year ;
    }


    public String toString() {
        return "Magazine  : " + "month " + this.month + "\n"
                            + "year  " + this.year + "\n" ;
    }

}
