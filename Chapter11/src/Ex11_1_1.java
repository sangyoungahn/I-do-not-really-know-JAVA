/**
 * Created by wwf12 on 2018-02-20.
 */
public class Ex11_1_1 {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMN";
        String reverse = (new StringBuilder(str)).reverse().toString();

        System.out.println(reverse);
    }
}
