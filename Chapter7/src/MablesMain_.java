/**
 * Created by wwf12 on 2018-02-07.
 */
class ChildProperty_ {
    int numOfBead;

    public ChildProperty_(int bead) {
        numOfBead=bead;
    }

    public void obtainBead(ChildProperty_ child, int obtainCount) {
        int obtainBeadCount = child.loseBead(obtainCount);
        numOfBead += obtainBeadCount;
    }

    public int loseBead(int loseCount) {
        if(numOfBead<loseCount) {
            int retValue=numOfBead;
            numOfBead=0;
            return retValue;
        }
        
        numOfBead -= loseCount;
        return loseCount;
    }

    public void showProperty() {
        System.out.println("현재 보유 구슬 개수 : " + numOfBead);
    }
}

public class MablesMain_ {
    public static void main(String[] args) {
        ChildProperty_ child1 = new ChildProperty_(15);
        ChildProperty_ child2 = new ChildProperty_(9);

        System.out.println("게임 시작 전 보유 구술 개수");
        System.out.println("*****어린이1*****");
        child1.showProperty();
        System.out.println("*****어린이2*****");
        child2.showProperty();

        // 1차 게임 : 어린이1은 어린이2의 구슬 2개를 획득
        child1.obtainBead(child2, 2);

        // 2차 게임 : 어린이2는 어린이1의 구슬 7개를 획득
        child2.obtainBead(child1, 7);

        System.out.println("게임 시작 후 보유 구술 개수");
        System.out.println("*****어린이1*****");
        child1.showProperty();
        System.out.println("*****어린이2*****");
        child2.showProperty();
    }
}
