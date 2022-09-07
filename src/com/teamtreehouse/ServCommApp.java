package com.teamtreehouse;

import java.util.Scanner;

public class ServCommApp {
    public static void main(String[] args) {

    //Display a menu, prompts for user input (int selection), and returns the input.
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("\nWhat would you like to do?"
                    + "\n1- Search Music" + "\n2- Search TV Shows"
                    + "\n3- Find Zipcode" + " \n4- Exit" + "\nSelection: ");

            int selection = sc.nextInt();
            switch (selection) {
                case 1:
                    System.out.println("Enter the musician you want to search: ");
                    String mquery = sc.next();
                    MusicFind search = new MusicFind(mquery);
                    System.out.println("Here is the data that you requested:\n");
                    System.out.println(search.getResults("https://itunes.apple.com/search?term=" + mquery));
                    break;
                case 2:
                    System.out.println("Enter the television show you want to search: ");
                    String showInput = sc.next();
                    TVshow show = new TVshow(showInput);
                    System.out.println("Here is the television show that you requested:\n");
                    System.out.println(show.getResults("http://api.tvmaze.com/singlesearch/shows?q=" + showInput));
                    break;
                case 3:
                    System.out.println("Enter the zipcode to be searched: ");
                    String zipcode = sc.next();
                    Zipcode zipcode1 = new Zipcode(zipcode);
                    zipcode1.connect();
                    System.out.println("\nHere is the data that you requested:\n");
                    String inCode = zipcode1.get();
                    System.out.println(inCode);
                    break;
                case 4:
                    System.exit(4);
                    break;
                default:
                    System.out.println("\nThat is not a valid selection!\n");
            }
        }
    }
}