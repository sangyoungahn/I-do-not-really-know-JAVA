/**
 * Created by wwf12 on 2018-02-05.
 */
public class Ex6_2_1_answer {
    public static void main(String[] args) {
        System.out.println("원 둘레(2.4) : " + calCircleRound(2.4));
        System.out.println("원 둘레(2.4) : " + calCircleArea(2.4));
    }

    public static double calCircleArea(double rad) {
        double pi=3.14;
        return rad*rad*pi;
    }

    public static double calCircleRound(double rad) {
        double pi=3.14;
        return 2*rad*pi;
    }
}
