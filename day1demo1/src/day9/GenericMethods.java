package day9;

import java.util.*;
/*
定义一个通用的(带泛型)的方法，该方法可以返回Collection集合中的最大值。
* */
public class GenericMethods {

    public static <T extends Comparable<T>> T findMax(Collection<T> collection) {
        Iterator<T> iterator = collection.iterator();
        T max = iterator.next(); // Assume the first element is the max initially

        while (iterator.hasNext()) {
            T next = iterator.next();
            if (next.compareTo(max) > 0) {
                max = next; // Update max if the next element is greater
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Example usage:

        Collection<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers,3, 5, 2, 8, 6, 7);
        Integer maxNumber = findMax(numbers);
        System.out.println("The maximum number is: " + maxNumber);

    }
}
