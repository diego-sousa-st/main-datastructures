package com.diegogouveia.sorting;

import java.util.List;

public interface Sort<E extends Comparable<E>> {

    List<E> sort(List<E> unsortedList);

}
