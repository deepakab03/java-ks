package com.deepak.ks.core_java_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

    private List<String> nameList = new LinkedList<String>();
    
    public void addName(String nameToAdd) {
        nameList.add(nameToAdd);
        
//        nameList.add(new Integer(5));
    }

    public List<String> getNameList() {
        return nameList;
    }

}
