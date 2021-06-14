package com.trevo;

public class Main {


    public static void main(String[] args) {
	// write your code here
        calculateScore("Trevin",500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);

    }

    public static  int calculateScore(String PlayerName,int score){
        System.out.println("player" + PlayerName + "scored" + score + "points");
        return score * 1000;
    }
    public static int calculateScore(int score){
        System.out.println("unnamed player scored" + score + "points");
        return score * 1000;

    }


}
