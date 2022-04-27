//2016112154 정동구
public class Triangle extends Shape {

    // 생성자에서 super 호출
    public Triangle(Color c) {
        super(c);
    }

    public void applyColor() {
        System.out.print("Triangle filled with color ");
        color.applyColor();
    }
}
