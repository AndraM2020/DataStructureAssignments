package com.company;

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

        for (String sent : sentences) {
            System.out.println(sent);
            if (checkPalindrome(sent)) {
                System.out.println("This sentence is a palindrome");
            } else {
                System.out.println("This sentence is not a palindrome");
            }
        }
        BlockingQueue<String> sentences1 = new ArrayBlockingQueue<String>(4);
        sentences1.add("Mom");
        sentences1.add("Was it a car or a cat I saw?");
        sentences1.add("Madam, in Eden, I’m Adam.");
        sentences1.add("Yo, banana boy!");

        for (String sent1 : sentences1) {
            System.out.println(sent1);
            if (checkPalindrome(sent1)) {
                System.out.println("This sentence is a palindrome");
            } else {
                System.out.println("This sentence is not a palindrome");
            }
        }
    }
}
