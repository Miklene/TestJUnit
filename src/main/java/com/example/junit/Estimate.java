package com.example.junit;

import java.util.ArrayList;

public class Estimate {

    public int makeEstimate(ArrayList<Person> arrayList){
        int estimate=0;
        for(int i=0;i<arrayList.size();i++)
            estimate+=arrayList.get(i).getSalary();
        return estimate;
    }


}
