package implementation.week9.PaperCompany.PaperProductInventory;

import implementation.week9.PaperCompany.ClientManagement.Order;
import implementation.week9.PaperCompany.EmployeeManagement.Employees.SalesEmployee;

import java.util.HashMap;
import java.util.Map;

public class SaleReport
{
    private Map<SalesEmployee, Double> salesData;

    public SaleReport()
    {
        this.salesData = new HashMap<>();
    }

    public Map<SalesEmployee, Double> getSalesData()
    {
        return salesData;
    }

    public void setSalesData(Map<SalesEmployee, Double> salesData)
    {
        this.salesData = salesData;
    }

    public void recordSale(SalesEmployee rep, Order order) {
        double saleAmount = order.calculateTotalAmount();
        rep.recordSale(saleAmount);
        salesData.put(rep, salesData.getOrDefault(rep, 0.0) + saleAmount);
    }

    public double getTotalSalesForRep(SalesEmployee rep)
    {
        return salesData.getOrDefault(rep, 0.0);
    }
}
