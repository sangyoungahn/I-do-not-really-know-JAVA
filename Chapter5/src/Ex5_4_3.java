/**
 * Created by wwf12 on 2018-01-30.
 */
public class Ex5_4_3 {
    public static void main(String[] args) {
        int n = 1, sum = 0;

        while (n <= 1000) {
            if ((n % 2) == 0 && (n % 7) == 0) {
                System.out.println(n);
                sum += n;
            }
            n++;
        }
        System.out.println("합 : " + sum);
    }
        /*do {
            sum += n;
            System.out.println(++n);
        } while((n%2)==0 && (n%7)==0);
    }*/
}
