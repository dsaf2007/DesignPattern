//2016112154 정동구
public abstract class Shape {
    //상속을 위해 protected
    protected Color color;
    Shape(Color c)
    {
        color = c;
    }

    //추상메소드 설정
    public abstract void applyColor();
    
}
