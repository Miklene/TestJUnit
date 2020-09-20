package com.example.junit;

public class Main {

    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.addPerson(new Person(100));
        staff.addPerson(new Person(200));
        staff.addPerson(new Person(300));
        staff.addPerson(new Person(400));
        staff.addPerson(new Person(500));
    }

}
