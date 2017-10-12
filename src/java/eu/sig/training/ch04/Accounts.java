package eu.sig.training.ch04;

public class Accounts {

    protected Money balance = new Money();

    public static CheckingAccount findAcctByNumber(String number) {
        return new CheckingAccount();
    }

    public static boolean isValid(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum = sum + (9 - i) * Character.getNumericValue(number.charAt(i));
        }
        return sum % 11 == 0;
    }

    protected void addInterest(float interestPercentage) {
        Money interest = balance.multiply(interestPercentage);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }

    protected Transfer makeTransfer(String counterAccount, Money amount) throws BusinessException {
        return null;
    }
}