package implementation.week9.Remembering;

import implementation.week9.Remembering.People.Celebrity;
import implementation.week9.Remembering.System.TributeManager;
import implementation.week9.Remembering.Works.*;

import java.util.Scanner;

public class Remembering {
    public static void main(String[] args) {
        TributeManager tm = new TributeManager();

        Celebrity matthewPerry = new Celebrity("Matthew Perry", "Actor");
        Celebrity liamPayne = new Celebrity("Liam Payne", "Singer");

        tm.addCelebrity(matthewPerry);
        tm.addCelebrity(liamPayne);

        matthewPerry.addWorkToTimeline(1994, new Work("Friends", WorkType.SERIES));
        liamPayne.addWorkToTimeline(2019, new Work("Strip That Down", WorkType.SONG));

        // User interaction to add tributes
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a tribute for Matthew Perry:");
        String tributeForMatthew = scanner.nextLine();
        matthewPerry.addTribute(tributeForMatthew);

        System.out.println("Enter a tribute for Liam Payne:");
        String tributeForLiam = scanner.nextLine();
        liamPayne.addTribute(tributeForLiam);

        // Display tributes
        matthewPerry.displayTributes();
        liamPayne.displayTributes();

        scanner.close();
    }
}