package implementation.week9.PaperCompany.EmployeeManagement.Employees;

import implementation.week9.PaperCompany.EmployeeManagement.Departments.Department;

public class SalesEmployee extends Employee
{
    private final double commissionRate;
    private double totalSales;

    public SalesEmployee(String employeeId, String name, double baseSalary,
                         Department department, double commissionRate) {
        super(employeeId, name, baseSalary, department);
        this.commissionRate = commissionRate;
        this.totalSales = 0.0;
    }

    public void recordSale(double saleAmount)
    {
        totalSales += saleAmount;
    }

    @Override
    public double calculateEarning()
    {
        return getBaseSalary() + (commissionRate * totalSales);
    }
}