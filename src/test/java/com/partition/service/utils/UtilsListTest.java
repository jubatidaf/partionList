package com.partition.service.utils;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class UtilsListTest {


    /*List<Integer> bigList = new ArrayList<>();
    @Before
    public void setup() {
        for (int i = 0; i<100000000;i++){
            bigList.add(1);
        }
    }
    @Test
    public void testIfMethodeWorkWithLowDataOfSize() {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
        //test size of list
        assertEquals(7, numbers.size());

        //testPartition
        assertEquals(1, UtilsList.ofSize(numbers, 7).size());
        assertEquals(2,UtilsList.ofSize(numbers, 6).size());
        assertEquals(2,UtilsList.ofSize(numbers, 5).size());
        assertEquals(4,UtilsList.ofSize(numbers, 2).size());
        assertEquals(3,UtilsList.ofSize(numbers, 3).size());
        assertEquals(4,UtilsList.ofSize(numbers, 2).size());
        assertEquals(7,UtilsList.ofSize(numbers, 1).size());
    }

    @Test
    public void testIfMethodeWorkWithManyDataOfSize() {

        //test_with_100 million data
        assertEquals(100000000,UtilsList.ofSize(bigList, 1).size());
        assertEquals(50000000,UtilsList.ofSize(bigList, 2).size());
        assertEquals(25000000,UtilsList.ofSize(bigList, 4).size());
        assertEquals(100,UtilsList.ofSize(bigList, 1000000).size());
        assertEquals(10,UtilsList.ofSize(bigList, 10000000).size());
        assertEquals(1,UtilsList.ofSize(bigList, 100000000).size());

    }

    @Test
    public void testIfListNull(){
        assertEquals(0,UtilsList.ofSize(null, 1).size());
    }*/
}