//2016112154 정동구
public class Pentagon extends Shape {

    // 생성자에서 super 호출
    public Pentagon(Color c) {
        super(c);
    }

    public void applyColor() {
        System.out.print("Pentagon filled with color ");
        color.applyColor();
    }
}
