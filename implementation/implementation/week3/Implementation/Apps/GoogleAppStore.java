package implementation.week3.Implementation.Apps;

import implementation.week3.Implementation.Conditions.DownloadNotAllowedException;
import implementation.week3.Implementation.Users.Purchase;

public class GoogleAppStore extends AppStore
{
    public GoogleAppStore(String currency)
    {
        super(currency);
    }

    @Override
    public void uploadApp(App app) throws DownloadNotAllowedException
    {
        getApps().add(app);
    }

    @Override
    public void purchase(Purchase purchase)
    {
        addPurchase(purchase);
    }
}