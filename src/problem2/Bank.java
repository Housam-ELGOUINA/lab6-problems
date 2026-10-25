package problem2;

import java.util.ArrayList;

public class Bank {
    private String name ;
    ArrayList<Customer> Customers  =  new ArrayList<>() ;

    Bank(String name) {
        this.name  = name ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void addCustomer(Customer c ) {

        for ( int i =0 ; i < Customers.size() ;i++) {
            if( Customers.get(i) == c) {
                System.out.println("customer already existing!!") ;
                return ;
            }
        }
        this.Customers.add(c);
    }

    public void addTransaction(Customer c , double transaction) {
        for ( int i = 0 ; i < this.Customers.size() ; i++) {
            if (this.Customers.get(i) == c) {
                c.addDoubleRapperElements(transaction);
            }
        }
    }

    public void printStatement(Customer c ) {
        System.out.println("The customer  :" + c.getName());

        for ( int i = 0  ; i < c.getDoubleRapperElements().size() ; i++) {
            System.out.println("Transaction i : "+ c.getDoubleRapperElements().get(i));
        }
    }
}
