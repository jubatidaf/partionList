package com.partition;

import com.partition.service.utils.UtilsList;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class maintTestPartition {
    public static void main(String [] args) throws ParseException {
        final List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        System.out.println(UtilsList.ofSize(numbers, 5));
        System.out.println(UtilsList.ofSize(numbers, 2));
    }
}
