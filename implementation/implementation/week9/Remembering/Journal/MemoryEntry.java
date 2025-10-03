package implementation.week9.Remembering.Journal;

import java.io.Serializable;
import java.time.LocalDateTime;

public class MemoryEntry implements Serializable {
    private String memoryText;
    private LocalDateTime timestamp;

    /**
     * Constructor of MemoryEntry
     * @param memoryText is a string
     */
    public MemoryEntry(String memoryText) {
        this.memoryText = memoryText;
        this.timestamp = LocalDateTime.now();
    }

    /**
     * Get the text of the MemoryEntry
     * @return a string
     */
    public String getMemoryText()
    {
        return memoryText;
    }

    /**
     * Change the text of the MemoryEntry
     * @param memoryText is the new string
     */
    public void setMemoryText(String memoryText)
    {
        this.memoryText = memoryText;
    }

    /**
     * Get the date of the MemoryEntry
     * @return a LocalDateTime
     */
    public LocalDateTime getTimestamp()
    {
        return timestamp;
    }

    /**
     * Change the date of the MemoryEntry
     * @param timestamp is the changed LocalDateTime
     */
    public void setTimestamp(LocalDateTime timestamp)
    {
        this.timestamp = timestamp;
    }
}