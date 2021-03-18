package com.example.hello;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Hello {
    private static int i;
    private static String s;
    public static void main(String[] args) throws IOException {
        String dontworry="";
        int guessedInt=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello little darling.\nIts little game that I have maked for the course`s challange.\nWhat is your name?:");
        System.out.println("Hi "+scanner.nextLine());
        Scanner scanner1= new Scanner(System.in);
        while(true) {
            System.out.println("Do you want to start game?:(Y or N)");
            String start_or_not = scanner1.nextLine();
            if (start_or_not.equals("Y")) {
                Random random = new Random();
                System.out.println("I have generated one number till 20 from 1.Guess it,you can guess only 5 time");
                Scanner scanner2 = new Scanner(System.in);
                for (int i = 1; i <= 5; i++) {
                    int rand_num = random.nextInt(20) + 1;
                    if (i != 1) {
                        if (guessedInt > rand_num) {
                            System.out.println("Guess lower than last time");
                        } else if (guessedInt < rand_num) {
                            System.out.println("Guess highter than last time");
                        }
                    }
                    guessedInt = scanner2.nextInt();
                    if (guessedInt == rand_num) {
                        System.out.println("Congratulations dude,you have won this game after " + i + " times");
                        break;
                    } else {
                        switch (i) {
                            case 1:
                                dontworry = "But dont worry you can try again! ";
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                dontworry = "Its your last chance ";
                                break;
                            case 5:
                                dontworry = "GAME OVER ";
                                break;
                            default:
                                dontworry = "";
                        }
                        System.out.println("You have maked " + i + " mistakes." + dontworry);

                    }
                }
            }
        }
    }

}








