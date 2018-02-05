/**
 * Created by wwf12 on 2018-02-05.
 */
public class Ex6_2_1 {
    public static void main(String[] args) {
        int rad = 5;

        double area = area(rad);
        double circum = circum(rad);

        System.out.println("원의 넓이 : " + area);
        System.out.println("원의 둘레 : " + circum);
    }

    public static double area(int rad) {
        double area = rad * rad * 3.14;
        return area;
    }

    public static double circum(int rad) {
        double circum = 2 * 3.14 * rad;
        return circum;
    }
}
