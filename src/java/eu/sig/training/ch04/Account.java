package eu.sig.training.ch04;

/**
 * Created by Galih_P on 12/10/2017.
 */
public abstract class Account {

    protected Money balance = new Money();

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
