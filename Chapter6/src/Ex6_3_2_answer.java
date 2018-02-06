/**
 * Created by wwf12 on 2018-02-06.
 */
public class Ex6_3_2_answer {
    public static void main(String[] args) {
        toBinary(175);
    }

    public static int toBinary(int decimal) {
        if(decimal > 0) {
            int bin = decimal%2;
            decimal /= 2;
            toBinary(decimal);

            System.out.println(bin);
        }

        return 0;
    }
}
