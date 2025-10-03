package implementation.week1.KingsQuests.Implementation.Quest;

import implementation.week1.KingsQuests.Implementation.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestResult
{
    private boolean success;
    private int xpEarned;
    private List<Item> itemsEarned;

    public QuestResult(boolean success, int xpEarned, List<Item> itemsEarned)
    {
        this.success = success;
        this.xpEarned = xpEarned;
        this.itemsEarned = new ArrayList<>(itemsEarned);
    }

    public boolean isSuccess()
    {
        return success;
    }

    public int getXpEarned()
    {
        return xpEarned;
    }

    public List<Item> getItemsEarned()
    {
        return Collections.unmodifiableList(itemsEarned);
    }

    @Override
    public String toString() {
        return "QuestResult{" +
                "success=" + success +
                ", xpEarned=" + xpEarned +
                ", itemsEarned=" + itemsEarned +
                '}';
    }
}