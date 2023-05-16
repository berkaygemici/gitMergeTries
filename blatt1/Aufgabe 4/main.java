import java.util.Scanner;
import java.lang.Math;


public class main {
    public static void computerRaten(int numToGuess) {
        double rand = Math.random() * 101;
        //lutfenlutfen
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

    public static void selberRaten() {
        //kafayiyicm
        Scanner input = new Scanner(System.in);
        Random randomize =new Random();
        int unsereNummer =randomize.nextInt(100);
        unsereNummer +=1;
        boolean isGuessed = false;
        int tries =0;
        while(!isGuessed) {
            tries +=1;
            System.out.println("Bitte geben Sie Ihre Zahl ein:");
            int antwort =input.nextInt();
            if(antwort==unsereNummer) {
                System.out.println("Ja, Sie haben die Zahl erraten.");
                isGuessed=true;
                System.out.println("Sie haben in "+tries+" Versuchen die Zahl erraten.");
            } else if (antwort>unsereNummer) {
                System.out.println("Die von Ihnen angegebene Zahl ist größer als die tatsächliche Zahl.");
            } else {
                System.out.println("Die von Ihnen angegebene Zahl ist kleiner als die tatsächliche Zahl.");
            }
        }
    }
    public static void main(String[] args) {
        int numToGuess;
        if(args.length>0) {
             numToGuess = Integer.parseInt(args[0]);
             computerRaten(numToGuess);
        } else {
            selberRaten();
        }
    }
}