/**
 * Created by wwf12 on 2018-02-17.
 */
public class StringInstance {
    public static void main(String[] args) {
        java.lang.String str = "My name is Sunny";

        int strLen1 = str.length();
        System.out.println("길이 1 : " + strLen1);

        int strLen2 = "한글이 길이는 어떻게?".length();
        System.out.println("길이 2 : " + strLen2);
    }
}
