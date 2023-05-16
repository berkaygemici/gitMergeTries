import java.util.Scanner;
import java.lang.Math;


public class main {
    public static void computerRaten(int numToGuess) {
        double rand = Math.random() * 101;
        int randomNumber = (int) rand;
        //0'dan 100e kadar
        System.out.println("Random Number:" + randomNumber);
        while(randomNumber!=numToGuess){
            rand = Math.random() * 100;
            randomNumber = (int) rand;
            System.out.println("Random Number:" + randomNumber);
            System.out.println("Input number != Random number ");
            if (randomNumber == numToGuess) {
                System.out.println("yeeess ! " + randomNumber);
            }
        }
    }
    public static void main(String[] args) {
        int numToGuess;
        if(args.length>0) {
             numToGuess = Integer.parseInt(args[0]);
             computerRaten(numToGuess);
        } else {
            System.out.println("Parametre girilmedi ki");
        }
    }
}