package implementation.week9.ChefMyFridge.Interfaces;

public interface Storable {
    int preferredTemperature(); // e.g. in °C
    boolean requiresRefrigeration();
}