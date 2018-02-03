/**
 * Created by wwf12 on 2018-02-03.
 */
public class Star_3 {
    public static void main(String[] args) {
        double randomValue = Math.random();
        int ran = (int) (randomValue * 20) + 1;

        for(int row=0;row<=ran;row++){
            for(int col=0;col<ran-row;col++){
                System.out.print("*");
            }

            for(int col=0;col<2*row+1;col++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
