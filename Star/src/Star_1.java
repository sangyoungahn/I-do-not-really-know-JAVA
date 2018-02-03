/**
 * Created by wwf12 on 2018-02-03.
 */
public class Star_1 {
    public static void main(String[] args) {
        double randomValue = Math.random();
        int ran = (int)(randomValue * 20) + 1;

        for(int row=1;row<=ran;row++) {
            for(int col=1;col<=ran;col++)
                System.out.print("*");
            System.out.println();
        }
    }
}
