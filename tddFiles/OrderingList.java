package com.company;

public class OrderingList {
    public int[] orderArray(int[] array){
		if (array == null){
			return null;
		}
        for (int i =0; i< array.length; i++){
            for (int j =0; j< array.length; j++){
                if(j<i && array[j] > array [i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
