package com.javarush.task.task03.task0325;

/* 
Финансовые ожидания
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int s = Integer.parseInt(n);
        System.out.print("Я буду зарабатывать " + "$" + n + " в час");

    }
}
