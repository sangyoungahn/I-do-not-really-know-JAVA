/**
 * Created by wwf12 on 2018-02-04.
 */
public class Ex5_7_2_answer {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if((i*10+j)+(j*10+i) == 99)
                    System.out.println(i + ", " + j);
            }
        }
    }
}
