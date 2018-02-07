/**
 * Created by wwf12 on 2018-02-07.
 */
class FruitSeller_ {
    int numOfApple;
    int myMoney;
    final int APPLE_PRICE;

    public FruitSeller_(int money, int appleNum, int price) {
        myMoney=money;
        numOfApple=appleNum;
        APPLE_PRICE=price;
    }

    public int saleApple(int money) {
        int num=money/APPLE_PRICE;
        numOfApple -= num;
        myMoney += money;
        return num;
    }
    public void showSaleResult() {
        System.out.println("남은 사과 : " + numOfApple);
        System.out.println("판매 수익 : " + myMoney);
    }
}

class FruitBuyer_ {
    int myMoney=5000;
    int numOfApple=0;

    public void buyApple(FruitSeller seller, int money) {
        numOfApple += seller.saleApple(myMoney);
        myMoney -= money;
    }
    public void showBuyResult() {
        System.out.println("현재 잔액 : " + myMoney);
        System.out.println("사과 개수 : " + numOfApple);
    }
}

public class FruitSalesMain3 {
    public static void main(String[] args) {
        FruitSeller_ seller1 = new FruitSeller_(0, 30, 1500);
        FruitSeller_ seller2 = new FruitSeller_(0, 20, 1000);

        FruitBuyer_ buyer = new FruitBuyer_();
        buyer.buyApple(seller1, 4500);
        buyer.buyApple(seller2, 2000);

        System.out.println("과일 판매자1의 현재 상항");
        seller1.showSaleResult();

        System.out.println("과일 판매자2의 현재 상항");
        seller2.showSaleResult();

        System.out.println("과일 구매자의 현재 상항");
        buyer.showBuyResult();
    }
}
