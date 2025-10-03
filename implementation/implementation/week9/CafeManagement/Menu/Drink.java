package implementation.week9.CafeManagement.Menu;

public class Drink
{
    private String title;
    private double price;
    private int stock;

    public Drink(String title, double price, int stock)
    {
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getStock()
    {
        return stock;
    }

    public void setStock(int stock)
    {
        this.stock = stock;
    }
}