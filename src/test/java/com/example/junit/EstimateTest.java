package com.example.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class EstimateTest {

    @Test
    public void makeEstimate() {
        Person person1 = new Person(100);
        Person person2 = new Person(200);
        Person person3 = new Person(300);
        ArrayList<Person> arrayList = new ArrayList<Person>();
        arrayList.add(person1);
        arrayList.add(person2);
        arrayList.add(person3);
        Estimate estimate = new Estimate();
        int expected = estimate.makeEstimate(arrayList);
        int actual = person1.getSalary() + person2.getSalary() + person3.getSalary();
        Assert.assertEquals(expected,actual);

    }
}