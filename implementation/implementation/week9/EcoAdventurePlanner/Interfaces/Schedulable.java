package implementation.week9.EcoAdventurePlanner.Interfaces;

import java.time.LocalDate;

public interface Schedulable {
    public void reschedule(LocalDate reschedule);
    public LocalDate getDate();
}