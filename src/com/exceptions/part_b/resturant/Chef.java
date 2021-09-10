package com.exceptions.part_b.resturant;

public class Chef {
    private Manager manager;

    public Chef() {
        this.manager = new Manager();
    }

    public void prepareFood(String order) throws Exception {
            manager.checkFood(order);

    }
}
