package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Assignment1 {

    public static void main(String[] args) {
        ArrayList<String> randomValues = new ArrayList<String>();
        randomValues.add("Computer");
        randomValues.add("Plate");
        randomValues.add("Chair");
        randomValues.add("Girl");
        randomValues.add("Boy");
        randomValues.add("Cat");
        randomValues.add("Dog");
        randomValues.add("Shirt");
        randomValues.add("Determination");

        startingWithC(randomValues);
        endingWithE(randomValues);
        withLenght5(randomValues);
        containingE(randomValues);
        substringTe(randomValues);
        histogram(randomValues);
        alphabeticalSorting(randomValues);

    }

    public static void startingWithC(ArrayList<String> randomValues) {
        int startsWithCCount = 0;
        for (int i = 0; i < randomValues.size(); i++)
            if (randomValues.get(i).charAt(0) == 'C')
                startsWithCCount++;
        {
            System.out.println("There are " + startsWithCCount + " value(s) starting with 'C'. ");
        }
    }

    public static void endingWithE(ArrayList<String> randomValues) {
        int endsWithECount = 0;
        for (int i = 0; i < randomValues.size(); i++)
            if (randomValues.get(i).charAt(randomValues.get(i).length() - 1) == 'e')
                endsWithECount++;
        {
            System.out.println("There are " + endsWithECount + " value(s) ending with an 'e'.");
        }
    }

    public static void withLenght5(ArrayList<String> randomValues) {
        int valuesWithLengthOf5Count = 0;
        for (int i = 0; i < randomValues.size(); i++)
            if (randomValues.get(i).length() == 5)
                valuesWithLengthOf5Count++;
        {
            System.out.println("There are " + valuesWithLengthOf5Count + " value(s) with the length of 5.");
        }
    }

    public static void containingE(ArrayList<String> randomValues) {
        int valuesCountainingEcount = 0;
        for (int i = 0; i < randomValues.size(); i++)
            if (randomValues.get(i).contains("e"))
                valuesCountainingEcount++;
        {
            System.out.println("There are " + valuesCountainingEcount + " value(s) containing letter 'e'");
        }
    }

    public static void substringTe(ArrayList<String> randomValues) {
        boolean isThereSubStringTe = false;
        for (int i = 0; i < randomValues.size(); i++)
            if (randomValues.get(i).contains("te"))
                isThereSubStringTe = true;
        if (isThereSubStringTe) {
            System.out.println("There are values containing substring 'te'.");
        } else {
            System.out.println("There are no substring 'te' found");
        }
    }

    public static void histogram(ArrayList<String> randomValues) {
        int[] arrForCountedWords = new int[12];

        for (int j = 0; j < arrForCountedWords.length; j++) {
            int charCounter2 = 0;
            for (String word : randomValues) {
                if (j == word.length()) {
                    charCounter2++;
                }
            }
            arrForCountedWords[j] = charCounter2;
            if (charCounter2 != 0) {
                System.out.println("There are " + arrForCountedWords[j] + " word(s) with " + j + " characters.");
            }
        }
    }

    public static void alphabeticalSorting(ArrayList<String> randomValues) {

        System.out.println("Unsorted ArrayList values: "
                + randomValues);

        // Sorting ArrayList in ascending Order
        // using Collection.sort() method
        Collections.sort(randomValues);

        // Print the sorted values
        System.out.println("Sorted ArrayList values in ascending order: "
                + randomValues);
    }

}
