package eu.sig.training.ch04;

/**
 * Created by Galih_P on 12/10/2017.
 */
public class Utils {

    public static int validateAccount(String counterAccount) {
        int sum = 0; // <1>
        for (int i = 0; i < counterAccount.length(); i++) {
            char character = counterAccount.charAt(i);
            int characterValue = Character.getNumericValue(character);
            sum = sum + (9 - i) * characterValue;
        }

        return sum;
    }
}
