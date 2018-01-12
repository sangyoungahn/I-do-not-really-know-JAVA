/**
 * Created by wwf12 on 2018-01-12.
 */
public class CastingOperation {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 'Z';

        int num1 = ch1;
        int num2 = (int)ch2;

        System.out.println("문자 A의 유니코드 값 : " + num1);
        System.out.println("문자 Z의 유니코드 값 : " + num2);
    }
}
