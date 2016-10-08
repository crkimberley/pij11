/**
 * @author crkimberley on 08/10/2016.
 */
public class Company {
    private GenericDLL<String> employeeNames;
    private GenericDLL<Integer> employeeNINumbers;

    public Company() {
        employeeNames = new GenericDLL<String>();
        employeeNINumbers = new GenericDLL<Integer>();
    }

    public GenericDLL<String> getEmployeeNames() {
        return employeeNames;
    }

    public GenericDLL<Integer> getEmployeeNINumbers() {
        return employeeNINumbers;
    }
}
