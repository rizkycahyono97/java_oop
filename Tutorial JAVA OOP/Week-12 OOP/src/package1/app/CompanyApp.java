package package1.app;

import package1.data.Company;;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Maju Pesat");

        Company.Employee employee = company.new Employee();
        employee.setName("Fulan");

        Company company2 = new Company();
        company2.setName("Belum Ada");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("Test");
        System.out.println(employee2.getName());
        System.out.println(employee2.getCompany());

    }
}
