public class Main {
    public static void main(String[] args) {
        CreditCard card1 =new CreditCard(12312322,100);
        CreditCard card2 =new CreditCard(32344486,500);
        CreditCard card3 =new CreditCard(89546721,1000);

        card1.enrollmentCash(300);
        card2.enrollmentCash(400);
        card3.takeOffCash(300);

        card1.showInfoCard();
        card2.showInfoCard();
        card3.showInfoCard();

    }
}