package implementation.week14.home.devices;

import implementation.week14.home.enums.Content;
import implementation.week14.home.exceptions.ItemNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class SmartFridge extends SmartDevice
{
    private List<Content> contents;

    public SmartFridge(String deviceName, double powerCost)
    {
        super(deviceName, powerCost);
        this.contents = new ArrayList<>();
    }

    @Override
    public void performTask() throws ItemNotFoundException
    {
        // Check & Perform
        removeContent(Content.SANDWICH);
        System.out.println("Snack prepared!");
    }

    public List<Content> getContents()
    {
        return this.contents;
    }

    public void addContent(Content content)
    {
        // Check
        checkIfContentNull(content);

        // Act
        this.contents.add(content);
    }

    public void removeContent(Content content) throws ItemNotFoundException
    {
        // Check
        checkIfContentAvailable(content);

        // Act
        this.contents.remove(content);
    }

    /** HELPER method: Check if content is available in the fridge */
    private void checkIfContentAvailable(Content content) throws ItemNotFoundException
    {
        if (content == null || !this.contents.contains(content))
        {
            throw new ItemNotFoundException("WARNING: Content is not found!");
        }
    }

    /** HELPER method: Check if content is null */
    private static void checkIfContentNull(Content content)
    {
        if (content == null)
        {
            throw new IllegalArgumentException("WARNING: Content is null!");
        }
    }
}