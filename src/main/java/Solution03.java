/*
 *     UCF   COP3330 Fall 2021 Assignment 1 Solution03
 *     Copyright 2021 Sean Moore
 */

import java.util.Scanner;

public class Solution03 {


    public static void main(String[] args){
        /*
        Create an application that prompts
        the user for an input quote
        it receives the quote as input
        prompt for the author of the quote
        it receives the author as input
        the author and quote are returned in a
        sentence via string concatenation
         */

        //  Use a scanner for input
        Scanner input = new Scanner(System.in);
        String author, quote;
        
        //  Take two strings, a quote and an author, as input on two separate lines at prompt to the user
        System.out.printf("What is the quote? ");
        quote = input.nextLine();
        System.out.printf("Who said it? ");
        author = input.nextLine()
            
        //  Print out the author and quote
        System.out.println(author + " says, \"" + quote + "\"");
    }
}
