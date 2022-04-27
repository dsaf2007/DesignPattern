//2016112154_정동구
import java.util.*;

//Observer를 이용 주의 표시가 왜 뜨는지는 모르겠으나 작동은 잘됨.
//DogWathcer는 Observer이다.
public class DogWatcher implements Observer {
	protected String name;
	
	DogWatcher(String n) {
		name = n;
	}
	
	//Observable 객체에 Observer 등록
	public void startWatching(Observable d) {
		d.addObserver(this);
	}
	
	//Observable 객체에서 Observer 제거
	public void stopWatching(Observable d) {
		d.deleteObserver(this);
	}
	
	//Update 알림
	public void update(Observable o, Object arg) {
		String s = name + " observes " + o + " " + arg;
		System.out.println(s);
	}

	//toString override
	@Override
	public String toString() {
		return name;
	}
	
}
