package com.company;

import java.util.Arrays;

public class OrderingList {
    public int[] orderArray(int[] array){
        if(array == null){
            return null;
        }
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();

        int[] count = new int[max-min+1];
        int[] output = new int[array.length];
        for (int x: array){
            ++count[x-min];
        }
        for (int j = 1; j <= (max-min);j++){
            count[j]+=count[j-1];
        }

        for (int x: array){
            output[count[x-min]-1] = x;
            --count[x-min];
        }

        return output;
    }

}
