/**
 * @author crkimberley on 07/10/2016.
 */
public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhoneTest spTest = new SmartPhoneTest();
        spTest.test1();
        spTest.test2();
        spTest.test2A();
        MobilePhone phone = new SmartPhone("Nokia");
        spTest.test3(phone);
        spTest.test4(phone);
        spTest.test5(new MobilePhone("Samsung"));
    }

    // Q2.1 Start
    // Build SmartPhone with line SmartPhone myPhone = new Smartphone()
    // and then use all its methods
    private void test1() {
        System.out.println("\nTEST1\n");
        SmartPhone myPhone = new SmartPhone("Apple");
        myPhone.call("45723");
        System.out.println(myPhone.getBrand());
        myPhone.ringAlarm("Wake Up!!!");
        myPhone.playGame("Tetris");
        myPhone.call("5705");
        myPhone.call("00123");
        myPhone.printLastNumbers();
        myPhone.browseWeb("sabian.com");
        System.out.println(myPhone.findPosition());
    }

    // Q2.2 Direct upcasting
    // Change the script so that the SmartPhone is created with the line:
    // MobilePhone myPhone = new SmartPhone();
    // Compile...any problems? Why? Possible solutions?
    //
    // browseWeb() & findPosition() are SmartPhone methods - won't compile now: "cannot find symbol..."
    private void test2() {
        System.out.println("\nTEST2\n");
        MobilePhone myPhone = new SmartPhone("Apple");
        myPhone.call("45723");
        System.out.println(myPhone.getBrand());
        myPhone.ringAlarm("Wake Up!!!");
        myPhone.playGame("Tetris");
        myPhone.call("5705");
        myPhone.call("00123");
        myPhone.printLastNumbers();
        //myPhone.browseWeb("sabian.com");
        //System.out.println(myPhone.findPosition());
    }

    // Q2.2 Direct upcasting - solution
    // Downcasting to SmartPhone
    private void test2A() {
        System.out.println("\nTEST2A\n");
        MobilePhone myPhone = new SmartPhone("Apple");
        myPhone.call("45723");
        System.out.println(myPhone.getBrand());
        myPhone.ringAlarm("Wake Up!!!");
        myPhone.playGame("Tetris");
        myPhone.call("5705");
        myPhone.call("00123");
        myPhone.printLastNumbers();
        ((SmartPhone) myPhone).browseWeb("sabian.com");
        System.out.println(((SmartPhone) myPhone).findPosition());
    }

    // Q2.3 Indirect upcasting when calling a method
    // Pass this object to a method testPhone(Phone) that has only one parameter of type Phone.
    // What methods can you call on the object inside the method?
    //
    // Can only use call() method - only method in Phone interface
    private void test3(Phone phone) {
        System.out.println("\nTEST3\n");
        phone.call("45723");
        //System.out.println(phone.getBrand());
        //phone.ringAlarm("Wake Up!!!");
        //phone.playGame("Tetris");
        //phone.call("5705");
        phone.call("00123");
        //phone.printLastNumbers();
        //phone.browseWeb("sabian.com");
        //System.out.println(phone.findPosition());
    }

    // Q2.4 Downcasting
    // Inside the former method, downcast the object to Smartphone
    // so that you can use all the public methods of Smartphone.
    private void test4(Phone phone) {
        System.out.println("\nTEST4\n");
        SmartPhone sp = (SmartPhone) phone;
        sp.call("45723");
        System.out.println(sp.getBrand());
        sp.ringAlarm("Wake Up!!!");
        sp.playGame("Tetris");
        sp.call("5705");
        sp.call("00123");
        sp.printLastNumbers();
        sp.browseWeb("sabian.com");
        System.out.println(sp.findPosition());
    }

    // Q2.5 Casting exception
    // Create a MobilePhone object and then pass it to method testPhone(Phone). What happens?
    //
    // spTest.test6(new MobilePhone("Samsung"));
    //
    // call() is only method initially
    // Downcast to Mobilephone to use extra methods
    // Can't downcast MobilePhone to SmartPhone though for those methods:-
    // "java.lang.ClassCastException: MobilePhone cannot be cast to SmartPhone"
    private void test5(Phone phone) {
        System.out.println("\nTEST5\n");
        phone.call("45723");
        System.out.println(((MobilePhone) phone).getBrand());
        ((MobilePhone) phone).ringAlarm("Wake Up!!!");
        ((MobilePhone) phone).playGame("Tetris");
        phone.call("5705");
        phone.call("00123");
        ((MobilePhone) phone).printLastNumbers();
        //((SmartPhone) phone).browseWeb("sabian.com");
        //System.out.println(((SmartPhone) phone).findPosition());
    }
}
