/**
 * Created by wwf12 on 2018-02-14.
 */
class CONTAC600 {
    SinivelCap sin;
    SneezeCap sne;
    SnuffleCap snu;

    public CONTAC600() {
        sin = new SinivelCap();
        sne = new SneezeCap();
        snu = new SnuffleCap();
    }

    public void take() {
        sin.take();
        sne.take();
        snu.take();
    }
}

class ColdPatient_ {
    public void takeCONTAC600(CONTAC600 cap) { cap.take();}
}

public class Encapsulation2 {
    public static void main(String[] args) {
        ColdPatient_ sufferer = new ColdPatient_();
        sufferer.takeCONTAC600(new CONTAC600());
    }
}
