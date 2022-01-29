package com.partition.service.impl;

import com.partition.service.utils.UtilsList;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ServicePartitionTest {

    @InjectMocks
    private  ServicePartition servicePartition= new ServicePartition();

    List<Integer> bigList = new ArrayList<>();
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
        assertEquals(1, servicePartition.partition(numbers, 7).size());
        assertEquals(2,servicePartition.partition(numbers, 6).size());
        assertEquals(2,servicePartition.partition(numbers, 5).size());
        assertEquals(4,servicePartition.partition(numbers, 2).size());
        assertEquals(3,servicePartition.partition(numbers, 3).size());
        assertEquals(4,servicePartition.partition(numbers, 2).size());
        assertEquals(7,servicePartition.partition(numbers, 1).size());
    }

    @Test
    public void testIfMethodeWorkWithManyDataOfSize() {

        //test_with_100 million data
        assertEquals(100000000,servicePartition.partition(bigList, 1).size());
        assertEquals(50000000,servicePartition.partition(bigList, 2).size());
        assertEquals(25000000,servicePartition.partition(bigList, 4).size());
        assertEquals(100,servicePartition.partition(bigList, 1000000).size());
        assertEquals(10,servicePartition.partition(bigList, 10000000).size());
        assertEquals(1,servicePartition.partition(bigList, 100000000).size());

    }
    @Test
    public void testIfListNull(){
        assertEquals(0,servicePartition.partition(null, 1).size());
    }

}