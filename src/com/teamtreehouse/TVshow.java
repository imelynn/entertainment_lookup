package com.teamtreehouse;

import java.util.Scanner;

public class TVshow extends ServiceCommunicator {
    private String show;

    public TVshow(String show) {
        super("http://api.tvmaze.com/singlesearch/shows?q=SEARCH" + show);
        this.show = show;
    }

    public TVshow() {

    }

    public String getShow() {
        return show;
    }

    public void setShow(String show) {
        this.show = show;
    }

    public static void main(String[] args) {
        //Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the television show to be searched: ");
        String showInput = sc.nextLine();

        //Pass user input into method
        TVshow search = new TVshow(showInput);
        System.out.println("Here is the television show that you requested:\n");
        System.out.println(search.getResults("http://api.tvmaze.com/singlesearch/shows?q=" + showInput));
        }
    }

