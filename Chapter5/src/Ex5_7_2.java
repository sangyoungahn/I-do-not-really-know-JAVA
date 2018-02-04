/**
 * Created by wwf12 on 2018-02-04.
 */
public class Ex5_7_2 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++)
            for (int j = 1; j < 10; j++) {
                if (i + j == 9) {
                    System.out.print(i);
                    System.out.print(j);
                    System.out.print(" + ");
                    System.out.print(j);
                    System.out.print(i);
                    System.out.print(" = ");
                    System.out.print(i + j);
                    System.out.println(j + i);
                }
            }
    }
}
