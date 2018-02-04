/**
 * Created by wwf12 on 2018-02-04.
 */
public class Ex5_7_1 {
    public static void main(String[] args) {
        for(int i=2;i<10;i++)
            for(int j=1;j<10;j++) {
                if (i % 2 == 0) {
                    if (j > i)
                        break;
                    System.out.println(i + " x " + j + " = " + i * j);
                }
            }
    }
}
