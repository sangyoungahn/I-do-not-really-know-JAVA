/**
 * Created by wwf12 on 2018-01-30.
 */
public class Ex_5_4_2 {
    public static void main(String[] args) {
        int n=0;

        while(n<100) {
            n++;
            System.out.println(n);
        }

        do {
            System.out.println(n);
            n--;
        } while(n>0);
    }
}
