package CreditCard;

/**
 * @author Inna Ignatovich
 * @Date 24.03.2026
 */
public class CreditCard {
    private String accountNum;
    private int carrentAmount;
    Double currentAmount;
    public CreditCard(String accountNum, int carrentAmount) {
        this.carrentAmount = carrentAmount;
        this.accountNum = accountNum;
    }

    public void putMoney(int money) {
        if (money > 0) {
            System.out.println("Счёт " + accountNum + " зачисление: " + money);
            this.carrentAmount += money;
        }else {
            System.out.println("Нельзя зачислить отрицательную сумму");
        }
    }

    public void drawMoney(int money) {
        if (this.carrentAmount >= money) {
            System.out.println("Счёт " + accountNum + " списание: " + money);
            this.carrentAmount -= money;
        } else {
            System.out.println("Недостаточно средств!");
        }
    }
    public void displayInfo() {
        System.out.println("Счёт: " + accountNum + ", баланс: " + carrentAmount);
    }
//    @Override
//    public String toString() {
//        return "Номер карты: " + accountNum + ", Сумма на счете: " + carrentAmount;
//
//    }
}
