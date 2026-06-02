package Praktikum14;

import java.util.ArrayList;

public class DemoArrayList29 {
    public static void main(String[] args) {
        ArrayList<Customer29> customers = new ArrayList<>(2);
        
        Customer29 customer1 = new Customer29(1, "Zakia");
        Customer29 customer2 = new Customer29(5, "Budi");
        
        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer29(4, "Cica"));

        for (Customer29 cust : customers) {
            System.out.println(cust.toString());
        }

        customers.add(2, new Customer29(100, "Rosa"));

        System.out.println(customers.indexOf(customer2));

        Customer29 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";

        for (Customer29 cust : customers) {
            System.out.println(cust.toString());
        }

        ArrayList<Customer29> newCustomers = new ArrayList<>();
        newCustomers.add(new Customer29(201, "Della"));
        newCustomers.add(new Customer29(202, "Victor"));
        newCustomers.add(new Customer29(203, "Sarah"));

        customers.addAll(newCustomers);

        for (Customer29 cust : customers) {
            System.out.println(cust.toString());
        }

        System.out.println(customers);
    }
}
