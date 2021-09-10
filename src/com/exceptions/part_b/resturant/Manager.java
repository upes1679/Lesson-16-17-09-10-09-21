package com.exceptions.part_b.resturant;

import java.io.IOException;

public class Manager {

    public void checkFood(String order) throws Exception {
            if (order=="pizza"){
                    throw new Exception("No pizzas left");
            }
    }
}
