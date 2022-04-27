//2016112154 정동구
import java.util.*;

public class Drawing extends Shape {

	//자식 객체에 대한 관리는 List를 주로 사용
	private List<Shape> shape_list = new ArrayList<Shape>();
	
	Drawing() {}
	//draw overriding
	public void draw(String color) {
		//List 내의 모든 객체에 대해 주어진 color로 draw 진행
		for(Shape s : shape_list) {
			s.draw(color);
		}
	}
	
	public void add(Shape s) {
		//List에 shape 추가
		this.shape_list.add(s);
	}
	
	public void remove(Shape s) {
		//List에서 입력 shape 삭제
		this.shape_list.remove(s);
	}
	
	public void clear() {
		//List 클리어 후 메세지 출력
		this.shape_list.clear();
		System.out.println("Clearing all the shapes from drawing");
	}
}
