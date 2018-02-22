/**
 * Created by wwf12 on 2018-02-22.
 */
public class Ex11_1_2_solution {
    public static void main(String[] args) {
        String str = "990208-1012752";
        StringBuilder sbuf = new StringBuilder(str);

        for(int i=0; i<sbuf.length(); i++) {
            if(sbuf.charAt(i)=='-') {
                sbuf.deleteCharAt(i);
                break;
            }
        }
        str=sbuf.toString();
        System.out.println(str);
    }
}
