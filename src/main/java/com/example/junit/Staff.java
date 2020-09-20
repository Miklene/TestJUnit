package com.example.junit;

import java.util.ArrayList;

public class Staff {
    ArrayList<Person> arrayList = new ArrayList<Person>();

    public ArrayList<Person> getArrayList() {
        return arrayList;
    }

    public void addPerson(Person person){
        arrayList.add(person);
    }


}
