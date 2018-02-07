/**
 * Created by wwf12 on 2018-02-07.
 */
class Triangle {
    double botton;
    double height;

    public Triangle(double bt, double hg) {
        botton=bt;
        height=hg;
    }
    public void setBotton(double bt) {
        botton=bt;
    }
    public void setHeight(double hg) {
        height=hg;
    }
    public double setArea() {
        return botton * height / 2;
    }
}

class TriangleInstanceTest{
    public static void main(String[] args) {
        Triangle tr = new Triangle(10.5, 16.2);
        System.out.println("삼각형의 넓이 : " + tr.setArea());

        tr.setBotton(7.5);
        tr.setHeight(9.2);
        System.out.println("삼각형의 넓이 : " + tr.setArea());
    }
}
