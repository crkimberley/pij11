/**
 * @author crkimberley on 29/09/2016.
 */
public class SmartPhone extends MobilePhone {

    public SmartPhone(String brand) {
        super(brand);
    }

    public void browseWeb(String address) {
        System.out.println("Browsing: " + address);
    }

    public String findPosition() {
        return "Position: London, WC1";
    }

    public void call(String number) {
        if (number.substring(0,2).equals("00")) {
            System.out.println("Calling: " + number + " through the internet to save money");
            storeNumberCalledAndIncrementCallCounter(number);
        } else {
            super.call(number);
        }
    }
}
