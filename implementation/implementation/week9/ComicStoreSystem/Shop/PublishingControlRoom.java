package implementation.week9.ComicStoreSystem.Shop;

import implementation.week9.ComicStoreSystem.Comics.ComicSeries;
import implementation.week9.ComicStoreSystem.Enums.Status;
import implementation.week9.ComicStoreSystem.People.Author;

public class PublishingControlRoom
{
    private Publisher publisher;

    public PublishingControlRoom(Publisher publisher)
    {
        this.publisher = publisher;
    }

    public Publisher getPublisher()
    {
        return publisher;
    }

    public void setPublisher(Publisher publisher)
    {
        this.publisher = publisher;
    }

    public boolean isPublishingStable(Author author)
    {
        for(ComicSeries series : author.getComics())
        {
            if(series.checkStatus() == Status.STABLE)
            {
                return true;
            }
        }
        return false;
    }
}