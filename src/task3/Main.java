package task3;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(12, 6, 8);

        atm.addMoney(2920);

        System.out.println(atm.takeOffMoney(atm.currentBankAccount));

    }
}
