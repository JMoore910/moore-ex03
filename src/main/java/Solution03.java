import java.util.Scanner;

public class Solution03 {
    /*
     *     UCF   COP3330 Fall 2021 Assignment 1 Solution03
     *     Copyright 2021 Sean Moore
     */

    public static void main(String[] args){
        /*
        - Create an application that prompts
        the user for an input quote
        it receives the quote as input
        prompt for the author of the quote
        it receives the author as input
        the author and quote are returned in a
        sentence via string concatenation
         */

        Scanner input = new Scanner(System.in);
        String author, quote;
        System.out.printf("What is the quote? ");
        quote = input.nextLine();
        System.out.printf("Who said it? ");
        author = input.nextLine();

        System.out.println(author + " says, \"" + quote + "\"");
    }
}
