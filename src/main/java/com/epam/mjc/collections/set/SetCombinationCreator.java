package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();
        Set<String> intersectionFirstSecond = new HashSet<>(firstSet);
        intersectionFirstSecond.retainAll(secondSet);
        for (String s : thirdSet) {
            if (!intersectionFirstSecond.contains(s)) {
                result.add(s);
            }
        }

        Set<String> unionFirstSecond = new HashSet<>(firstSet);
        unionFirstSecond.addAll(secondSet);
        thirdSet.removeAll(unionFirstSecond);
        result.addAll(thirdSet);

        return result;
    }
}
