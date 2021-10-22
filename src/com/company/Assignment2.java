package com.company;

import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Assignment2 {

   public static boolean checkPalindrome(String sent) {
       sent = sent.replaceAll("[^a-zA-Z]", "").toLowerCase();

       boolean isPalindrome = true;
        int i = 0;
        int k = sent.length() - 1;

        while (i < k) {
           if (sent.charAt(i) != sent.charAt(k)) {
                isPalindrome = false;

                break;
            } else {
               i++;
                k--;
           }

        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Stack<String> sentences = new Stack<>();
        sentences.push("Mom");
        sentences.push("Was it a car or a cat I saw?");
        sentences.push("Madam, in Eden, I’m Adam.");
        sentences.push("Yo, banana boy!");
        sentences.push("Is Java great or what?");

        for (String sent : sentences) {
            System.out.println(sent);
            if (checkPalindrome(sent)) {
                System.out.println("This sentence is a palindrome");
            } else {
                System.out.println("This sentence is not a palindrome");
            }
        }
        BlockingQueue<String> sentences1 = new ArrayBlockingQueue<String>(5);
        sentences1.add("Mom");
        sentences1.add("Was it a car or a cat I saw?");
        sentences1.add("Madam, in Eden, I’m Adam.");
        sentences1.add("Yo, banana boy!");
        sentences1.add("Is Java great or what?");

        for (String sent1 : sentences1) {
            System.out.println(sent1);
            if (checkPalindrome(sent1)) {
                System.out.println("This sentence is a palindrome");
            } else {
                System.out.println("This sentence is not a palindrome");
            }
        }

        System.out.print("Enter any string:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        Stack stack = new Stack();

        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        String reverseString = "";

        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }

        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");

    }
}
