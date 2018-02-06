/**
 * Created by wwf12 on 2018-02-06.
 */
public class Ex6_3_1 {
    public static void main(String[] args) {
        int num=5;

        System.out.println(square(num));
    }

    public static int square(int n) {
        if(n == 1)
            return 2;
        else
            return square(n-1) * 2;
    }
}
