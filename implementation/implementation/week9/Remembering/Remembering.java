package implementation.week9.Remembering;

import implementation.week9.Remembering.People.Celebrity;
import implementation.week9.Remembering.People.Fan;
import implementation.week9.Remembering.System.Tribute;
import implementation.week9.Remembering.System.TributeManager;
import implementation.week9.Remembering.Works.*;

import java.util.Scanner;

public class Remembering {
    public static void main(String[] args) {
        TributeManager tm = new TributeManager();

        Celebrity matthewPerry = new Celebrity("Matthew Perry", "Actor");
        Celebrity liamPayne = new Celebrity("Liam Payne", "Singer");

        Fan fan = new Fan("ophelia");

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

        // Add tribute by fan
        fan.addTribute(new Tribute("It's been 2 years since Matthew died, 1 year since Liam died."));

        // Display tributes
        matthewPerry.displayTributes();
        liamPayne.displayTributes();
        System.out.println(fan.getName() + " said: " + fan.getTributes().get(0).getText());

        scanner.close();
    }
}