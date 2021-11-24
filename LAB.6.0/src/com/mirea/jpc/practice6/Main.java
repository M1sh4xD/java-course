/*
TODO:
    - Add try-catch [done]
 */

package com.mirea.jpc.practice6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isDrawn = true;
        int count = 0;

        ArrayList<Integer> firstPlayerArray = new ArrayList<>();
        ArrayList<Integer> secondPlayerArray = new ArrayList<>();

        try {
            Scanner firstPlayerScan = new Scanner(System.in);
            System.out.println("Enter 5 cards of the first player: ");
            for (int i = 0; i < 5; i++) {
                firstPlayerArray.add(firstPlayerScan.nextInt());
            }

            Scanner secondPlayerScan = new Scanner(System.in);
            System.out.println("Enter 5 cards of the second player: ");
            for (int i = 0; i < 5; i++) {
                secondPlayerArray.add(secondPlayerScan.nextInt());
            }

            for (int i = 0; i < 106; i++) {
                count++;

                if (isPlayerPicksUpTheCards(firstPlayerArray.get(0), secondPlayerArray.get(0))) {
                    firstPlayerArray.add(firstPlayerArray.get(0));
                    firstPlayerArray.add(secondPlayerArray.get(0));
                } else if (isPlayerPicksUpTheCards(secondPlayerArray.get(0), firstPlayerArray.get(0))) {
                    secondPlayerArray.add(firstPlayerArray.get(0));
                    secondPlayerArray.add(secondPlayerArray.get(0));
                }

                firstPlayerArray.remove(0);
                secondPlayerArray.remove(0);

                if (firstPlayerArray.size() == 0) {
                    System.out.println("Second " + count);
                    isDrawn = false;
                    break;
                } else if (secondPlayerArray.size() == 0) {
                    System.out.println("First " + count);
                    isDrawn = false;
                    break;
                }
            }
            if (isDrawn)
                System.out.println("Botva!");
        } catch (InputMismatchException ime) {
            System.out.println("Invalid type, make sure that your input is int");
        }
    }

    private static boolean isPlayerPicksUpTheCards(int firstCard, int secondCard) {
        if (firstCard == 9 && secondCard == 0) {
            return false;
        } else {
            return (firstCard > secondCard || (firstCard == 0 && secondCard == 9));
        }
    }
}