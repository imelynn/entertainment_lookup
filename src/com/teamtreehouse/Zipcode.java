package com.teamtreehouse;

import java.util.Scanner;

public class Zipcode extends ServiceCommunicator {

    private String zipcode;

    public Zipcode(String zipcode) {
        super("http://api.zippopotam.us/us/" + zipcode);
        this.zipcode = zipcode;
    }
    public Zipcode() {

    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public static void main(String[] args){
        //Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the zipcode to be searched: ");
        String zipcode = sc.nextLine();

        //Pass user input into method
        Zipcode zipcode1 = new Zipcode(zipcode);
        zipcode1.connect();

        //Get results based on user input
        System.out.println("Here is the data that you requested:\n");
        String inCode = zipcode1.get();
        System.out.println(inCode);
    }

}
