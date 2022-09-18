public class CreditCard {
    int accountNumber;
    int currentAmount;

    CreditCard() {
    }

    CreditCard(int accountNumber, int currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }


    int enrollmentCash(int cash) {
        currentAmount = currentAmount + cash;
        return currentAmount;
    }

    int takeOffCash(int cash) {
        currentAmount = currentAmount - cash;
        return currentAmount;
    }

    void showInfoCard() {
        System.out.println("На счету " + accountNumber + " в текущий момент находится " + currentAmount + " Рублей.");
    }


}
