/**
 * Created by wwf12 on 2018-01-23.
 */
public class Ex4_1_2 {
    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        boolean result;

        num1 += 10;
        num2 += 10;
        result = (num1<0) && (num2 > 0);
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1 + ", num2 = " + num2);

        num1 += 10;
        num2 += 10;
        result = (num1>0) || (num2 > 0);
        System.out.println("result = " + result);
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }
}
