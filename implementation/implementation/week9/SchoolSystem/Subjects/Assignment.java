package implementation.week9.SchoolSystem.Subjects;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicInteger;

public class Assignment
{
    private int id;
    private String title;
    private String description;
    private LocalDate dueDate;

    public Assignment(String title, String description, LocalDate dueDate)
    {
        AtomicInteger counter = new AtomicInteger();
        this.id = counter.incrementAndGet();
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
    }

    public int getId()
    {
        return id;
    }

    public String getTitle()
    {
        return title;
    }

    public String getDescription()
    {
        return description;
    }

    public LocalDate getDueDate()
    {
        return dueDate;
    }

    public boolean isAfterDue()
    {
        return dueDate.isAfter(LocalDate.now());
    }
}