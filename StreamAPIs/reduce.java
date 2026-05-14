package com.nit.StreamAPI;

import java.util.*;

public class reduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        int sum = list.stream()
                      .reduce(0, (a, b) -> a + b);

        System.out.println("Sum = " + sum);
        
      

    }
}

