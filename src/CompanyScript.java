/**
 * @author crkimberley on 08/10/2016.
 */
public class CompanyScript {
    public static void main(String[] args) {
        new CompanyScript().launch();
    }

    private void launch() {
        Company company = new Company();
        company.getEmployeeNames().add("Jake");
        company.getEmployeeNames().add("Dan");
        company.getEmployeeNames().add("Sarah");
        company.getEmployeeNames().add("Chris");
        company.getEmployeeNames().printList();
        System.out.println("list length = " + company.getEmployeeNames().getLength());
        company.getEmployeeNINumbers().add(1004);
        company.getEmployeeNINumbers().add(1003);
        company.getEmployeeNINumbers().add(1002);
        company.getEmployeeNINumbers().add(1001);
        company.getEmployeeNINumbers().printList();
        System.out.println("list length = " + company.getEmployeeNINumbers().getLength());
    }
}