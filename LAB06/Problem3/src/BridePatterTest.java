//2016112154 정동구
public class BridePatterTest {
    public static void main(String[] args) {

        // 주어진 예제처럼 결과가 나오도록 Test예제 작성
        RedColor red = new RedColor();
        GreenColor green = new GreenColor();
        Triangle t = new Triangle(red);
        Pentagon p = new Pentagon(green);

        t.applyColor();
        p.applyColor();

    }

}
