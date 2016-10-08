/**
 * @author crkimberley on 29/09/2016.
 */
public class OldPhone implements Phone {

    private String brand = null;

    public OldPhone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void call(String number) {
        System.out.println("Calling: " + number);
    }
}
