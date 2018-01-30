/**
 * Created by wwf12 on 2018-01-30.
 */
public class Ex5_4_2_answer {
    public static void main(String[] args) {
        int n=1;

        while(n<=100)
            System.out.println(n++);

        do
            System.out.println(--n);
        while(n>1);
    }
}
