package implementation.week9.PaperCompany.ClientManagement;

import implementation.week9.PaperCompany.PaperProductInventory.PaperProduct;

import java.util.HashMap;
import java.util.Map;

public class Order
{
    private final String orderId;
    private final Map<PaperProduct, Integer> products;
    private double totalAmount;
    private final double discountRate; // e.g., bulk discount for large orders

    public Order(String orderId, double discountRate)
    {
        this.orderId = orderId;
        this.products = new HashMap<>();
        this.totalAmount = 0.0;
        this.discountRate = discountRate;
    }

    public void addProduct(PaperProduct product, int quantity)
    {
        products.put(product, quantity);
        this.totalAmount += product.getPricePerUnit() * quantity;
    }

    public double calculateTotalAmount()
    {
        return totalAmount * (1 - discountRate);
    }

    public String getOrderId()
    {
        return orderId;
    }

    public Map<PaperProduct, Integer> getProducts()
    {
        return products;
    }
}