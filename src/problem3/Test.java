package problem3;



import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner  sc  =  new Scanner(System.in) ;
        System.out.println("What is the capacity of ur library : ") ;
        int n  = sc.nextInt() ;
        Library library = new Library(n) ;

        Document doc1  =  new Document(100 , "doc1") ;
        Document doc2  = new Document(200 , "doc2") ;


        System.out.println("which operation you want to choose : add (a) , display (d) , delete (r) , exit (e)") ;

        String choice  =  sc.nextLine() ;
    }
}
