package implementation.week9.PaperCompany;

import implementation.week9.PaperCompany.EmployeeManagement.Departments.*;
import implementation.week9.PaperCompany.EmployeeManagement.Employees.*;

public class DunderAndMifflinPaperCompany {
    public static void main(String[] args) {

        // Initialize departments with specific features
        SalesDepartment salesDept = new SalesDepartment("Sales", 10000);
        HRDepartment hrDept = new HRDepartment("HR", 5000);
        RiskDepartment riskDept = new RiskDepartment("Risk", 20000);

        // Create and add employees
        SalesEmployee michael = new SalesEmployee("E01", "Michael Scott", 2500, salesDept, 0.1);
        HREmployee toby = new HREmployee("E02", "Toby Flenderson", 2000, hrDept);
        RiskEmployee angela = new RiskEmployee("E03", "Angela Martin", 2200, riskDept);

        // Add employees to departments
        salesDept.addEmployee(michael);
        hrDept.addEmployee(toby);
        riskDept.addEmployee(angela);

        // Record some sales for Michael
        salesDept.recordSale(3000);
        salesDept.recordSale(7000);

        // Perform department-specific functions
        salesDept.performDepartmentSpecificFunction();
        hrDept.addNewHire("Jim Halpert");
        hrDept.performDepartmentSpecificFunction();
        riskDept.reportIncident("Data breach on employee information.");
        riskDept.performDepartmentSpecificFunction();
    }
}