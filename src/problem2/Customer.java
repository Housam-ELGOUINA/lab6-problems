package problem2;

import java.util.ArrayList;

public class Customer {
    private String name ;
    ArrayList<Double> DoubleRapperElements  =  new ArrayList<>() ;


    Customer(String name) {
        this.name =  name ;
    }
    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getDoubleRapperElements() {
        return DoubleRapperElements;
    }

    public void addDoubleRapperElements(double t) {
        DoubleRapperElements.add(t) ;
    }
}
