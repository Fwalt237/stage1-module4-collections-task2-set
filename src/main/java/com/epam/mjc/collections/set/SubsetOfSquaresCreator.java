package com.epam.mjc.collections.set;


import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> result = new TreeSet<>();
        for (int element : sourceList) {
            int temp = element*element;
            if (temp >= lowerBound && temp <= upperBound) {
                result.add(temp);
            }
        }
        return result;
    }
}
