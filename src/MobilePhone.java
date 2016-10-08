/**
 * @author crkimberley on 29/09/2016.
 */
public class MobilePhone extends OldPhone {
    private final static int SIZE_OF_LAST_NUMBERS = 10;
    private String[] lastNumbers = new String[SIZE_OF_LAST_NUMBERS];
    private int callCounter = 0;

    public MobilePhone(String brand) {
        super(brand);
    }

    @Override
    public void call(String number) {
        super.call(number);
        storeNumberCalledAndIncrementCallCounter(number);
    }

    public void ringAlarm(String alarm) {
        System.out.println("ALARM: " + alarm);
    }

    void playGame(String game) {
        System.out.println("Playing: " + game);
    }

    public void printLastNumbers() {
        System.out.print("Last " + SIZE_OF_LAST_NUMBERS + " numbers called: ");
        int i = callCounter;
        do {
            System.out.print(lastNumbers[i] != null ? lastNumbers[i] + "  " : "");
            i = (i + 1) % SIZE_OF_LAST_NUMBERS;
        } while (i != callCounter);
        System.out.println();
    }

    public void storeNumberCalledAndIncrementCallCounter(String number) {
        lastNumbers[callCounter] = number;
        callCounter = (callCounter + 1) % SIZE_OF_LAST_NUMBERS;
    }
}