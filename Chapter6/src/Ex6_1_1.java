/**
 * Created by wwf12 on 2018-02-05.
 */
public class Ex6_1_1 {
    public static void main(String[] args) {
        int n1=13, n2=6;

        Cal(n1,n2);
    }

    public static void Cal(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + "몫 : " + (num1 / num2) + ", 나머지 : " + (num1 % num2));
    }
}
