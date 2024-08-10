/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.array.course;

/**
 *
 * @author Bmc pictures
 */
public class Marathon {
      public static void main(String[] args) {
        // Define the names and times of the runners
        String[] names = {"Elena", "Thomas", "Hamilion", "Suzie", "|Phili", "Matt", "Alex","Emma","John","James","Jane","Emily","Daniel","Neda","Aaron","Kate"};
        int[] times = {341,273,278,329,445,402,388,275,243,334,412,393,299,343,317,265};

        // Check if the arrays have the same length
        if (names.length != times.length) {
            System.out.println("Error: The number of names and times do not match.");
            return;
        }
        
        // Find the fastest and second fastest runners
        int fastestIndex = 0;
        int secondFastestIndex = -1;

        for (int i = 1; i < times.length; i++) {
            if (times[i] < times[fastestIndex]) {
                secondFastestIndex = fastestIndex;
                fastestIndex = i;
            } else if (secondFastestIndex == -1 || times[i] < times[secondFastestIndex]) {
                secondFastestIndex = i;
            }
        }
        
        // Print the fastest runner
        System.out.println("Fastest Runner: " + names[fastestIndex] + " with time " + times[fastestIndex] + " minutes");

        // Print the second fastest runner
        if (secondFastestIndex != -1) {
            System.out.println("Second Fastest Runner: " + names[secondFastestIndex] + " with time " + times[secondFastestIndex] + " minutes");
        } else {
            System.out.println("No second fastest runner found.");
        }
    }
}

