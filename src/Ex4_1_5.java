/**
 * Created by wwf12 on 2018-01-25.
 */
public class Ex4_1_5 {
    public static void main(String[] args) {
        int A = ((25+5)+(36/4)-72)*5;
        int B = ((25*5)+(36-4)+71)/4;
        int C = (128/4)*2;

        boolean isBig = (A>B) && (B>C);
        System.out.println(isBig);
    }
}
