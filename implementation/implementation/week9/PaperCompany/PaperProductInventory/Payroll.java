package implementation.week9.PaperCompany.PaperProductInventory;

import implementation.week9.PaperCompany.EmployeeManagement.Employees.Employee;

public class Payroll
{
    public double calculatePaycheck(Employee employee)
    {
        return employee.calculateEarning();
    }
}