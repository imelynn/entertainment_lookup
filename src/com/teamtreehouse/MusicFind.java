package com.teamtreehouse;

import java.util.Scanner;

public class MusicFind extends ServiceCommunicator {

    private String mquery;

    public MusicFind(String mquery) {
        super("https://itunes.apple.com/search?term=SEARCH&limit=1" + mquery);
        this.mquery = mquery;
    }

    public MusicFind() {

    }

    public String getMquery() {
        return mquery;
    }

    public void setMquery(String mquery) {
        this.mquery = mquery;
    }
    public static void main(String[] args){
        //Input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the musician you want to search: ");
        String mquery = sc.nextLine();

        //Pass user input into method
        MusicFind search = new MusicFind(mquery);
        System.out.println("Here is the musician/song that you requested:\n");
        System.out.println(search.getResults("https://itunes.apple.com/search?term=" + mquery));
    }

}
