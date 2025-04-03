package com.epam.mjc.collections.set;


import java.util.HashSet;
import java.util.List;


public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();
        for (Integer i : sourceList) {
            if(i%2==0){
                int temp = i;
                do{
                    resultSet.add(temp);
                    temp = temp/2;
                } while(temp%2==0);
                resultSet.add(temp);
            }else{
                resultSet.add(i);
                resultSet.add(i*2);
            }
        }
        return resultSet;
    }
}
