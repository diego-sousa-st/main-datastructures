package com.diegogouveia.sorting.impl;

import com.diegogouveia.sorting.Sort;

import java.util.List;

public class InsertSort<E extends Comparable<E>> implements Sort<E> {
    @Override
    public List<E> sort(List<E> unsortedList) {
        for (int index = 1; index < unsortedList.size(); index++) {
            var rightElement = unsortedList.get(index);
            var indexLeftElement = index - 1;
            while (indexLeftElement >= 0 && unsortedList.get(indexLeftElement).compareTo(rightElement) > 0) {
                var indexRightElement = indexLeftElement + 1;
                unsortedList.remove(indexRightElement);
                unsortedList.add(indexRightElement, unsortedList.get(indexLeftElement));
                indexLeftElement -= 1;
            }
            unsortedList.remove(indexLeftElement + 1);
            unsortedList.add(indexLeftElement + 1, rightElement);
        }
        return unsortedList;
    }

}
