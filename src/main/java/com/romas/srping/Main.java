package com.romas.srping;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        long start;
        long end;
        System.out.println("-------------------\nCreating and fulling lists\n-------------------");
//        System.out.println("Enter N:");
        Scanner scn = new Scanner(System.in);
        start = System.currentTimeMillis();
//        int N = scn.nextInt();
        int N = 10000000;

        System.out.println("start - " + start);
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++){
            arrayList.add(getRandomNumber(0, N));
        }
        end = System.currentTimeMillis();
        System.out.println("end - " + end);
        System.out.println("Array fulled in " + (end - start) + " mls");

        System.out.println();

        start = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("start - " + start);
        for (int i = 0; i < N; i++){
            linkedList.add((getRandomNumber(0, N)));
        }
        end = System.currentTimeMillis();
        System.out.println("end - " + end);
        System.out.println("Linked fulled in " + (end - start) + " mls");

        ///////////////////////////
        System.out.println("-------------------\nGettin randomly elements\n-------------------");
        ///////////////////////////

//        System.out.println("Enter X:");
//        int x = scn.nextInt();
        int x = 2000000;
        start = System.currentTimeMillis();
        System.out.println("start - " + start);
        System.out.println(arrayList.get(x));
        end = System.currentTimeMillis();
        System.out.println("end - " + end);
        System.out.println("Got element from array in " + (end - start) + " mls");

        System.out.println();

        start = System.currentTimeMillis();
        System.out.println("start - " + start);
        System.out.println(linkedList.get(x));
        end = System.currentTimeMillis();
        System.out.println("end - " + end);
        System.out.println("Got element from linked in " + (end - start) + " mls");

        ///////////////////////////
        System.out.println("-------------------\nGettin randomly elements by for loop\n-------------------");
        ///////////////////////////

        start = System.currentTimeMillis();
        System.out.println("start - " + start);
        for (int el: arrayList){
            if (el == x){
                System.out.println(arrayList.get(el));
                end = System.currentTimeMillis();
                System.out.println("end - " + end);
                System.out.println("Got element from array in " + (end - start) + " mls");
                break;
            }
        }

        System.out.println();

        start = System.currentTimeMillis();
        System.out.println("start - " + start);
        for (int el: linkedList){
            if (el == x){
                System.out.println(linkedList.get(el));
                end = System.currentTimeMillis();
                System.out.println("end - " + end);
                System.out.println("Got element from linked in " + (end - start) + " mls");
                break;
            }
        }

        ///////////////////////////
        System.out.println("-------------------\nEdding in front of list\n-------------------");
        ///////////////////////////

        int front_x = 1000;

        System.out.println("first int: " + arrayList.get(0) + " size: " + arrayList.size());
        start = System.currentTimeMillis();
        System.out.println("start - " + start);
        for (int i = 0; i < front_x; i++){
            arrayList.add(0, getRandomNumber(0, N));
        }
        end = System.currentTimeMillis();
        System.out.println("end - " + end);
        System.out.println("Add element in front of array in " + (end - start) + " mls");
        System.out.println("(after) first int: " + arrayList.get(0) + " size: " + arrayList.size());

        System.out.println();

        System.out.println("first int: " + linkedList.get(0) + " size: " + linkedList.size());
        start = System.currentTimeMillis();
        System.out.println("start - " + start);
        for (int i = 0; i < front_x; i++){
            linkedList.add(0, getRandomNumber(0, N));
        }
        end = System.currentTimeMillis();
        System.out.println("end - " + end);
        System.out.println("Add element in front of linked in " + (end - start) + " mls");
        System.out.println("(after) first int: " + linkedList.get(0) + " size: " + linkedList.size());

        ///////////////////////////
        System.out.println("-------------------\nEdding in end of list\n-------------------");
        ///////////////////////////

        int end_x = 1000000;

        System.out.println("last int: " + arrayList.get(arrayList.size() - 1) + " size: " + arrayList.size());
        start = System.currentTimeMillis();
        System.out.println("start - " + start);
        for (int i = 0; i < end_x; i++){
            arrayList.add(getRandomNumber(0, N));
        }
        end = System.currentTimeMillis();
        System.out.println("end - " + end);
        System.out.println("Add element in end of array in " + (end - start) + " mls");
        System.out.println("(after) last int: " + arrayList.get(arrayList.size() - 1) + " size: " + arrayList.size());

        System.out.println();

        System.out.println("last int: " + linkedList.get(linkedList.size() - 1) + " size: " + linkedList.size());
        start = System.currentTimeMillis();
        System.out.println("start - " + start);
        for (int i = 0; i < end_x; i++){
            linkedList.add(getRandomNumber(0, N));
        }
        end = System.currentTimeMillis();
        System.out.println("end - " + end);
        System.out.println("Add element in end of linked in " + (end - start) + " mls");
        System.out.println("(after) last int: " + linkedList.get(linkedList.size() - 1) + " size: " + linkedList.size());

        ///////////////////////////
        System.out.println("-------------------\nEdding in middle of list\n-------------------");
        ///////////////////////////

        int middle_x = 1000;
        int midddleOfArrayList = arrayList.size() / 2;
        int midddleOfLinkedList = arrayList.size() / 2;

        System.out.println("middle int: " + arrayList.get(arrayList.get(midddleOfArrayList)) + " size: " + arrayList.size());
        start = System.currentTimeMillis();
        System.out.println("start - " + start);
        for (int i = 0; i < middle_x; i++){
            arrayList.add(midddleOfArrayList + i, getRandomNumber(0, N));
        }
        end = System.currentTimeMillis();
        System.out.println("end - " + end);
        System.out.println("Add element in end of array in " + (end - start) + " mls");
        System.out.println("(after) middle int: " + arrayList.get(arrayList.get(midddleOfArrayList)) + " size: " + arrayList.size());

        System.out.println();

        System.out.println("middleOfLinkedList int:" + linkedList.get(midddleOfLinkedList) + " size: " + linkedList.size());
        start = System.currentTimeMillis();
        System.out.println("start - " + start);
        for (int i = 0; i < middle_x; i++){
            linkedList.add(midddleOfLinkedList + i, getRandomNumber(0, N));
        }
        end = System.currentTimeMillis();
        System.out.println("end - " + end);
        System.out.println("Add element in end of linked in " + (end - start) + " mls");
        System.out.println("(after) middleOfLinkedList int:" + linkedList.get(midddleOfLinkedList) + " size: " + linkedList.size());
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}