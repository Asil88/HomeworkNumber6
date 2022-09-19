package task3;

public class ATM {
    int currentBankAccount;
    int c20;
    int c50;
    int c100;

    public ATM() {
    }

    public ATM(int c20, int c50, int c100) {
        this.c20 += c20;
        this.c50 += c50;
        this.c100 += c100;
    }

    int addMoney(int addCash) {
        currentBankAccount = currentBankAccount + addCash;
        return currentBankAccount;
    }

    boolean takeOffMoney(int sum) {
        int savesum=sum;
        if (sum > c20 * 20 + c50 * 50 + c100 * 100) {
            sum = sum - (c20 * 20 + c50 * 50 + c100 * 100);
            System.out.println("Было на счету "+savesum+".Осталось на счету "+sum+" ||Сумма выданна "+c20+" (20 рублевыми),"+c50+" (50 рублевыми),"+c100+" (100 рублевыми) купюрами ");
            return true;
        } else{
            System.out.println("Произошла ошибка,невозможная сумма выдачи");
            return false;
        }
    }
}