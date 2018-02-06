/**
 * Created by wwf12 on 2018-02-06.
 */
public class Ex6_3_2 {
    public static void main(String[] args) {
        toBinary(175);
    }

    public static void toBinary(int decimal) {
        if (decimal > 0) {
            int bin = decimal % 2;
            decimal /= 2;
            toBinary(decimal);

            System.out.print(bin);
        }

        return;
    }
}
