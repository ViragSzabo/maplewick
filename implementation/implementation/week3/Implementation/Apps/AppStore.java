package implementation.week3.Implementation.Apps;

import implementation.week3.Implementation.Conditions.DownloadNotAllowedException;
import implementation.week3.Implementation.Users.Purchase;

import java.util.ArrayList;
import java.util.List;

public abstract class AppStore
{
    private String currency;
    private List<App> apps;
    protected List<Purchase> purchases;

    public AppStore(String currency)
    {
        this.currency = currency;
        this.apps = new ArrayList<>();
        this.purchases = new ArrayList<>();
    }

    public String getCurrency()
    {
        return currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public List<App> getApps()
    {
        return apps;
    }

    public void setApps(List<App> apps)
    {
        this.apps = apps;
    }

    public List<Purchase> getPurchases()
    {
        return purchases;
    }

    public void setPurchases(List<Purchase> purchases)
    {
        this.purchases = purchases;
    }

    /**
     * Make a new purchase
     * @param purchase is the requested purchase
     */
    public void addPurchase(Purchase purchase)
    {
        App app = purchase.getApp();
        double getDeveloperRevenue = app.getPrice() * 0.3;
        purchases.add(purchase);
        System.out.println("App price: " + app.getPrice() +
                        " Developer's price: " + getDeveloperRevenue);
    }

    /**
     * The abstract method of uploading a new app within the app store
     * @param app is the requested app
     * @throws DownloadNotAllowedException is the exception if the app does not meet all the requirements
     */
    public abstract void uploadApp(App app) throws DownloadNotAllowedException;

    /**
     * The abstract method of purchasing within the app store
     * @param purchase is the requested purchase
     */
    public abstract void purchase(Purchase purchase);

    /**
     * Calculate the total revenue of the app store
     * @return a double
     */
    public double calculateTotalRevenue()
    {
        double total = 0;
        for(Purchase purchase : purchases)
        {
            total += purchase.getApp().getPrice();
        }
        return total;
    }

    /**
     * Calculate the revenue for an app
     * @param app is the given app
     * @return a double
     */
    public double calculateRevenueForApp(App app)
    {
        double total = 0;
        for(Purchase purchase : purchases)
        {
            if(purchase.getApp().equals(app))
            {
                total += app.getPrice();
            }
        }
        return total;
    }
}