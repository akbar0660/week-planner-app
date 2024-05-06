package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        for (int i = 0; i < schedule.length; i++) {
            schedule[i][0] = DaysOfWeek.values()[i].name();
        }
        schedule[0][1] = "do home work";
        schedule[1][1] = "go to courses , watch a film";
        schedule[2][1] = "wake up";
        schedule[3][1] = "get up";
        schedule[4][1] = "oyan";
        schedule[5][1] = "ders oxu";
        schedule[6][1] = "yat";
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please , input the day of the week");
            String input = sc.nextLine();
            input = input.toLowerCase().trim();
            switch (input) {
                case "monday":
                    count = 1;
                    break;
                case "tuesday":
                    count = 2;
                    break;
                case "wednesday":
                    count = 3;
                    break;
                case "thursday":
                    count = 4;
                    break;
                case "friday":
                    count = 5;
                    break;
                case "saturday":
                    count = 6;
                    break;
                case "sunday":
                    count = 7;
                    break;
                case "exit":
                    System.exit(130);
            }
            if (count == 0) {
                System.out.println("sorry , i don't understand you , please try again");
            } else if (count >= 1 && count <= 7) {
                System.out.println("Your task for monday: " + schedule[count - 1][1]);
                count = 0;
            }
        }
    }
}