package implementation.week9.PaperCompany.EmployeeManagement.Employees;

import implementation.week9.PaperCompany.EmployeeManagement.Departments.Department;

public class HREmployee extends Employee
{

    public HREmployee(String employeeId, String name, double baseSalary, Department department)
    {
        super(employeeId, name, baseSalary, department);
    }

    @Override
    public double calculateEarning()
    {
        return getBaseSalary();
    }
}