package implementation.week9.ArtGallery.Operations;

import implementation.week9.ArtGallery.Enums.Status;

public interface ArtworkOperations
{
    double getPrice();
    void changeStatus(Status status);
    String getTitle();
}