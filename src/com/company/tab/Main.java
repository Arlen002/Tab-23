package com.company.tab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1, 100));}
        Collections.sort(arrayList);
        System.out.println(" Элементтер: " + arrayList);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.addAll(arrayList);
        System.out.print("Так сандар: ");
        for (int a:arrayList2) {
            if (a % 2 == 1)
                System.out.print(a + ", ");}

        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.addAll(arrayList);

        System.out.print("Жуп сандар: ");
        for (int j:arrayList3) {
            if (j % 2 == 0)
                System.out.print(j + ", ");
        }


    }
}
