package com.company.BuilderPattern;

import java.util.LinkedList;

class Product {
    private LinkedList<String> parts;

    public Product() {
        parts = new LinkedList<String>();
    }

    public void add(String part) {
        //Adding parts
        parts.addLast(part);
    }

    public void showProduct() {
        System.out.println("\n Product completed as below :");
        for (String part : parts)
            System.out.println(part);
    }
}
