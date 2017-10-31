package com.mmr;

import java.util.Iterator;
import java.util.List;

public class Employee {

    private int id;
    private String name;
    private List<Address> address;

    public Employee(int id, String name, List<Address> address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void show() {
        System.out.println(id + " : " + name);
        System.out.println(address);
        Iterator<Address> iterable =  address.iterator();
        while (iterable.hasNext()) {
            System.out.println(iterable.next());
            
        }
    }

}
