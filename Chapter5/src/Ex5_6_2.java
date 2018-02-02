/**
 * Created by wwf12 on 2018-01-31.
 */
public class Ex5_6_2 {
    public static void main(String[] args) {
        int num=1;
        int sum=0;

        while(true) {
            if((num%2) != 0)
                sum += num;
            else
                if((num%3) == 0)
                    sum += num;

            if(sum>1000) {
                System.out.println(num + "더할때 1000을 넘는다.");
                System.out.println("초과된 값 : " + sum);
                break;
            }
            num++;
        }
    }
}
