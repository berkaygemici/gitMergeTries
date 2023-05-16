import java.util.*;

public class main {
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
    public static void bonusUbung() {
        //Um diese Bonusaufgabe zu erstellen, habe ich Stackoverflow verwendet und gelernt, was binäre Suche ist.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen beim Zahlen-Ratespiel!");
        System.out.print("Geben Sie eine Zahl ein:");
        int target = scanner.nextInt();

        int low = 1;
        int high = 100;
        int attempts = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            attempts++;

            System.out.println("Versuche " + attempts + ": Erraten " + mid);

            if (mid == target) {
                System.out.println("Glückwunsch! Die Nummer lautet: " + mid);
                break;
            } else if (mid < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Anzahl der Versuche: " + attempts);
    }
    public static void main(String[] args) {
        selberRaten();
        //bonusUbung();
    }
}
