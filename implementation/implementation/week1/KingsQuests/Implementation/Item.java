package implementation.week1.KingsQuests.Implementation;

import java.util.Objects;

public class Item
{
    private String title;

    public Item(String title)
    {
        this.title = Objects.requireNonNull(title);
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = Objects.requireNonNull(title);
    }

    @Override
    public String toString()
    {
        return title;
    }
}