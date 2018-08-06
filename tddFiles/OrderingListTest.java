package com.company;

import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrderingListTest {

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void orderArray() {
        OrderingList test = new OrderingList();

        int[] expected = new int[20];
        int[] unordered = new int[20];

        for(int i = 0; i <20; i++){
            expected[i] = i;
            unordered[(i*11+7)%20]=i;
        }
        int[] real = test.orderArray(unordered);


        assertArrayEquals(expected,real);
    }

    @Test
    public void negativeArray() {
        OrderingList test = new OrderingList();

        int[] expected = new int[]{-20,-19,-18,-17,-16,-15,-14,-13,-12,0,1};
        int[] unordered = new int[]{-19,-18,-12,-13,-14,-20,-15,-16,-17,1,0};
        int[] real = test.orderArray(unordered);

        assertArrayEquals(expected,real);
    }
    @Test
    public void repeatedArray() {
        OrderingList test = new OrderingList();

        int[] expected = new int[]{0,0,1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9};
        int[] unordered = new int[]{0,9,1,1,2,2,5,3,4,4,5,3,6,6,7,7,8,8,9,0};

        int[] real = test.orderArray(unordered);


        assertArrayEquals(expected,real);
    }
    @Test
    public void nullArray() {
        OrderingList test = new OrderingList();

        int[] expected = null;
        int[] unordered = null;

        int[] real = test.orderArray(unordered);


        assertArrayEquals(expected,real);
    }
}