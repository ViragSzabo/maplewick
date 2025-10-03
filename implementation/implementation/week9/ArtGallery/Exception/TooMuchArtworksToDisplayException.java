package implementation.week9.ArtGallery.Exception;

public class TooMuchArtworksToDisplayException extends Exception
{
    public TooMuchArtworksToDisplayException()
    {
        super("More than 10 artworks to display is not possible!");
    }
}