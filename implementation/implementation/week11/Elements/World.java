package implementation.week11.Elements;

public class World {
    public static void main(String[] args) {
        try {
            FireCompanion blaze = new FireCompanion("Blaze", Element.FIRE, 20);
            Companion merra = new EarthCompanion("Merra", Element.FIRE, 20);

            blaze.train();
            merra.train();
            blaze.fuse(merra);
        } catch (FUSIONEXCEPTION e) {
            System.out.println(e.getMessage());
        }
    }
}