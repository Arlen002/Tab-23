package com.company;

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
        System.out.println(" Элементтер: "+arrayList);


        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList2.add(random.nextInt(1, 100));}
        Collections.sort(arrayList2);
        System.out.print(" Жуп cандар: ");
        for (int a : arrayList2) {
            if (a % 2 == 0)
                System.out.print(a+", ");}


        ArrayList<Integer> arrayList3 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arrayList3.add(random.nextInt(1, 100));}
        Collections.sort(arrayList3);
        System.out.println();
        System.out.print(" Так сандар: ");
        for (int t:arrayList3) {
            if (t % 2 == 1)
                System.out.print(t+", ");}
    }
}
