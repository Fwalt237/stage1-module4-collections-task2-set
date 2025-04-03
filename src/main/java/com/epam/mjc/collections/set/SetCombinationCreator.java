package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> intersectionFirstSecond = new HashSet<>(firstSet);
        intersectionFirstSecond.retainAll(secondSet);
        intersectionFirstSecond.removeAll(thirdSet);

        Set<String> unionFirstSecond = new HashSet<>(firstSet);
        unionFirstSecond.addAll(secondSet);
        Set<String> removeFirstSecond = new HashSet<>(thirdSet);
        removeFirstSecond.removeAll(unionFirstSecond);

        removeFirstSecond.addAll(intersectionFirstSecond);

        return removeFirstSecond;
    }
}
