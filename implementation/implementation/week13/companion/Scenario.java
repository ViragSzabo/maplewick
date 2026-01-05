package implementation.week13.companion;

import java.util.HashSet;
import java.util.List;

public class Scenario
{
    private String title;
    private String description;
    private HashSet<String> stakeholders;

    public Scenario(String title, String description, HashSet<String> stakeholders)
    {
        setTitle(title);
        setDescription(description);
        this.stakeholders = stakeholders;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        if (title == null || title.equals(""))
        {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }

        this.title = title;
    }

    public String getDescription()
    {
        return this.description;
    }

    public void setDescription(String description)
    {
        if (description == null || description.equals(""))
        {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }

        this.description = description;
    }

    public HashSet<String> getStakeholders()
    {
        return this.stakeholders;
    }

    public void addStakeholder(String stakeholder)
    {
        this.stakeholders.add(stakeholder);
    }

    public void removeStakeholder(String stakeholder)
    {
        this.stakeholders.remove(stakeholder);
    }

    @Override
    public String toString()
    {
        return "SCENARIO: " + title +
                "\nDescription: " + description +
                "\nStakeholders: " + stakeholders;
    }
}