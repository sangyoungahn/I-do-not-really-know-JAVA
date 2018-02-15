/**
 * Created by wwf12 on 2018-02-15.
 */
class InstCnt {
    static int instNum=100;

    public InstCnt() {
        instNum++;
        System.out.println("인스턴스 생성 : "+instNum);
    }
}

public class StaticValNoInst {
    public static void main(String[] args) {
        InstCnt.instNum -= 15;
        System.out.println(InstCnt.instNum);
    }
}
