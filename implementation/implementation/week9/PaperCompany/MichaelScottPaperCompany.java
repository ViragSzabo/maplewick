package implementation.week9.PaperCompany;

import implementation.week9.PaperCompany.EmployeeManagement.Departments.SalesDepartment;
import implementation.week9.PaperCompany.EmployeeManagement.Employees.*;

public class MichaelScottPaperCompany
{
    public static void main(String[] args) {
        // Create a department
        SalesDepartment salesDepartment = getSalesDepartment();

        // Calculate total earnings
        double totalEarnings = salesDepartment.calculateTotalEarning();
        System.out.println("Total earnings: " + totalEarnings + " $");

        // Display details of employees and their earnings
        for (Employee employee : salesDepartment.getEmployees()) {
            double earning = employee.calculateEarning(); // Assume a method to calculate earning exists in SalesEmployee
            System.out.println(employee.getName() + "'s earnings: " + earning + " $");
        }
    }

    private static SalesDepartment getSalesDepartment() {
        SalesDepartment salesDepartment = new SalesDepartment("Sales", 10000);

        // Create employees
        SalesEmployee michael = new SalesEmployee("E01", "Michael Scott", 3000, salesDepartment, 0.1);
        SalesEmployee pam = new SalesEmployee("E02", "Pam Beesly", 2500, salesDepartment, 0.05);
        SalesEmployee ryan = new SalesEmployee("E03", "Ryan Howard", 2200, salesDepartment, 0.08);

        // Add employees to the company
        salesDepartment.addEmployee(michael);
        salesDepartment.addEmployee(pam);
        salesDepartment.addEmployee(ryan);

        // Record some sales
        salesDepartment.recordSale(5000);
        salesDepartment.recordSale(8000);
        return salesDepartment;
    }
}