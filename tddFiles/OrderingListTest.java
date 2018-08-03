package com.company;

import org.testng.annotations.Test;

import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class OrderingListTest {

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
}