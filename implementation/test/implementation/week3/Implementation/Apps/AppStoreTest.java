package implementation.week3.Implementation.Apps;

import implementation.week3.Implementation.Conditions.DownloadNotAllowedException;
import implementation.week3.Implementation.Users.Purchase;
import implementation.week3.Implementation.Users.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AppStoreTest {
    AppStore appleStore;
    AppStore googlePlayStore;
    App game1;
    App game2;
    App game3;
    User user;

    @BeforeEach
    void setUp() {
        this.appleStore = new AppleAppStore("USD");
        this.googlePlayStore = new GoogleAppStore("EUR");

        this.game1 = new App("ActionGame", 5.99, true, false);
        this.game2 = new App("CasualGame", 1.99, false, false);
        this.game3 = new App("MatureGame", 7.99, true, true);

        this.user = new User("Charlie", "charlie@example.com", LocalDate.of(1985, 10, 5));
    }

    @Test
    void uploadApp() {
        try {
            appleStore.uploadApp(game1);
            System.out.println("Get the uploaded app: " + game1.getName());
            assertEquals(game1, appleStore.getApps().get(0));
        } catch (DownloadNotAllowedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void calculateTotalRevenue() {
        try {
            googlePlayStore.uploadApp(game2);
            googlePlayStore.uploadApp(game3);
            googlePlayStore.purchase(new Purchase(user, game2));
            googlePlayStore.purchase(new Purchase(user, game3));
            System.out.println("The size of the GooglePlayStore: " + googlePlayStore.getApps().size());
        } catch (DownloadNotAllowedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(9.98, googlePlayStore.calculateTotalRevenue());
    }

    @Test
    void calculateRevenueForApp() {
        try {
            googlePlayStore.uploadApp(game3);
            System.out.println(game3.getName() + " " + game3.getPrice());
        } catch (DownloadNotAllowedException e) {
            throw new RuntimeException(e);
        }
        assertEquals(1.99, game3.getPrice());
    }
}