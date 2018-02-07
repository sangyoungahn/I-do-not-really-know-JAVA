/**
 * Created by wwf12 on 2018-02-07.
 */
class FruitSeller {
    int numOfApple=20;
    int myMoney=0;
    final int APPLE_PRICE=1000;

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

class FruitBuyer {
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

public class FruitSalesMain1 {
    public static void main(String[] args) {
        FruitSeller seller = new FruitSeller();
        FruitBuyer buyer = new FruitBuyer();
        buyer.buyApple(seller, 2000);   // seller에게 2000원어치 사과 구매

        System.out.println("과일 판매자의 현재 상항");
        seller.showSaleResult();

        System.out.println("과일 구매자의 현재 상항");
        buyer.showBuyResult();
    }
}
