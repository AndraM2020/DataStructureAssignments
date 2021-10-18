package com.company;

import java.util.ArrayList;

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
            System.out.println("There are " + startsWithCCount + " value(-s) starting with 'C'. ");
        }
    }

    public static void endingWithE(ArrayList<String> randomValues) {
        int endsWithECount = 0;
        for (int i = 0; i < randomValues.size(); i++)
            if (randomValues.get(i).charAt(randomValues.get(i).length() - 1) == 'e')
                endsWithECount++;
        {
            System.out.println("There are " + endsWithECount + " value(-s) ending with an 'e'.");
        }
    }

    public static void withLenght5(ArrayList<String> randomValues) {
        int valuesWithLengthOf5Count = 0;
        for (int i = 0; i < randomValues.size(); i++)
            if (randomValues.get(i).length() == 5)
                valuesWithLengthOf5Count++;
        {
            System.out.println("There are " + valuesWithLengthOf5Count + " value(-s) with the length of 5.");
        }
    }

    public static void containingE(ArrayList<String> randomValues) {
        int valuesCountainingEcount = 0;
        for (int i = 0; i < randomValues.size(); i++)
            if (randomValues.get(i).contains("e"))
                valuesCountainingEcount++;
        {
            System.out.println("There are " + valuesCountainingEcount + " value(-s) containing letter 'e'");
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
                System.out.println("There are " + arrForCountedWords[j] + " words with " + j + " characters.");
            }
        }
    }

    //sorting alphabetically
    public static void alphabeticalSorting(ArrayList<String> randomValues) {
        String temp;

        for (int times = 0; times < randomValues.size(); times++) { //times necessary to go through the list
            for (int i = 0; i < randomValues.size() - 1 - times; i++) { //going through the list minus last element minus last looptime (or the number of elements already sorted)
                if (randomValues.get(i).compareToIgnoreCase(randomValues.get(i + 1)) > 0) { //compare>0 if the first is larger; compare<0 if second is larger; compare=0 if equal
                    temp = randomValues.get(i);
                    randomValues.set(i, randomValues.get(i + 1)); //changing i-th element to i+1 element
                    randomValues.set(i + 1, temp);
                }
            }
        }
        for (String word : randomValues) {
            System.out.println(word);
        }
        System.out.println();
    }

}
