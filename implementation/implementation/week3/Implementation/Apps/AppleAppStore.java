package implementation.week3.Implementation.Apps;

import implementation.week2.Implementation.Hospital_Part2.CodeBlackException;
import implementation.week3.Implementation.Conditions.DownloadNotAllowedException;
import implementation.week3.Implementation.Conditions.Validation;
import implementation.week3.Implementation.Users.Purchase;
import implementation.week3.Implementation.Users.User;

public class AppleAppStore extends AppStore
{
    public AppleAppStore(String currency)
    {
        super(currency);
    }

    /**
     * Add a new app to the apple app store
     * @param app is the requested app
     * @throws DownloadNotAllowedException is the exception if something does not meet the requirements
     */
    @Override
    public void uploadApp(App app) throws DownloadNotAllowedException
    {
        if (app.isContainsNudity())
        {
            throw new DownloadNotAllowedException("Apple is contains Nudity");
        }
        getApps().add(app);
    }

    /**
     * Make a purchase within the apple app store
     * @param purchase is the requested purchase
     */
    @Override
    public void purchase(Purchase purchase)
    {
        addPurchase(purchase);
    }

    /**
     * Make a purchase as a user for an app
     * @param validation for safety
     * @param user the user making the request
     * @param app is the requested item withing the apple app store
     * @throws DownloadNotAllowedException if it does not meet the validation rules to purchase
     */
    public void purchaseApp(Validation validation, User user, App app) throws DownloadNotAllowedException
    {
        try
        {
            if (!validation.checkValidationForDownload(user, app))
            {
                throw new DownloadNotAllowedException(
                        "User " +
                        user.getName() +
                        " is not allowed to download " +
                        app.getName());
            }
        }
        catch (CodeBlackException e)
        {
            throw new RuntimeException(e);
        }

        Purchase purchase = new Purchase(user, app);
        purchase(purchase);
    }
}