package implementation.week12.highcourt.inventory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest
{
    private Inventory fresh_Computer;
    private Inventory last_year_PC;
    private Inventory fresh_coffee_maker;
    private Inventory two_year_popcorn_maker;

    @BeforeEach
    void setup()
    {
        this.fresh_coffee_maker = new Inventory(
                "coffee maker",
                LocalDate.of(2024, 4, 28),
                InventoryType.KITCHEN_APPLIANCES);

        this.fresh_Computer = new Inventory(
                "Gamer Computer",
                LocalDate.of(2025, 8, 14),
                InventoryType.ELECTRONICS);

        this.last_year_PC = new Inventory(
                "Personal Computer",
                LocalDate.of(2024, 8, 5),
                InventoryType.ELECTRONICS);

        this.two_year_popcorn_maker = new Inventory(
                "popcorn maker",
                LocalDate.of(2023, 1, 10),
                InventoryType.KITCHEN_APPLIANCES);
    }

    @Test
    void getValue_electronicsMadeThisYear_returns20()
    {
        // Acting
        double value = fresh_Computer.getValue(LocalDate.now());

        // Asserting
        assertEquals(20, value, "Value should be 20");
    }

    @Test
    void getValue_electronicsMadeLastYear_returns200()
    {
        // Acting
        double value = last_year_PC.getValue(LocalDate.now());

        // Asserting
        assertEquals(200, value, "Value should be 200");
    }

    @Test
    void getValue_kitchenAppliancesMadeThisYear_returns100()
    {
        // Acting
        double value = fresh_coffee_maker.getValue(LocalDate.now());

        // Asserting
        assertEquals(100, value, "Value should be 100");
    }

    @Test
    void getValue_kitchenAppliancesMadeEarlierThanLastYear_returns0()
    {
        // Acting
        double value = two_year_popcorn_maker.getValue(LocalDate.now());

        // Asserting
        assertEquals(0, value, "Value should be 0");
    }
}