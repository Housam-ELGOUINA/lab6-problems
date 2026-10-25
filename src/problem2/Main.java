package problem2;

public class Main {
    public static void main(String[] args) {

        // 1. Create a Bank
        Bank bank = new Bank("UM6P Bank");

        // 2. Create customers
        Customer customer1 = new Customer("Housam");
        Customer customer2 = new Customer("Ahmed");

        // 3. Add customers to the bank
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);


        // 4. Try adding the same customer again
        bank.addCustomer(customer1);

        bank.addTransaction(customer1, 1000.0);  // Credit
        bank.addTransaction(customer1, -200.0);  // Debit
        bank.addTransaction(customer1, -50.0);   // Debit

        bank.addTransaction(customer2, 500.0);   // Credit
        bank.addTransaction(customer2, -100.0);  // Debit

        bank.printStatement(customer1);
        bank.printStatement(customer2);
    }
}