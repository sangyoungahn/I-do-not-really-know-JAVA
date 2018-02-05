/**
 * Created by wwf12 on 2018-02-05.
 */
public class Ex6_1_2 {
    public static void main(String[] args) {
        Sub(7, 3);
        Sub(-5, -3);
        Sub(4, -3);
    }

    public static void Sub(int num1, int num2) {
        if(num1>num2)
            System.out.println("절대값 : " + (num1-num2));
        else
            System.out.println("절대값 : " + (num2-num1));
    }
}
