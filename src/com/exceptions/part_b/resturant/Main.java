package com.exceptions.part_b.resturant;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer=new Customer();
        Waiter waiter= new Waiter();
        waiter.recieveOrder(customer, "pizza");
    }
}
