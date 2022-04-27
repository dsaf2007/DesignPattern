//2016112154_정동구

import java.util.*;

public class ObservableDogBot extends Observable implements DogBot {
	private int count = 0;
	private DogBot innerdogbot;

	//생성자
	ObservableDogBot(DogBot d) {
		innerdogbot = d;
	}
	
	//Observer 등록, Observer 수 증가
	public void addObserver(DogWatcher dw) {
		dw.startWatching(this);
		count++;
	}
	
	//Observer 제거, Observer 수 감소
	public void deleteObserver(DogWatcher dw) {
		dw.stopWatching(this);
		count--;
	}
	
	//data의 변화가 있을 때에만 Notify 진행
	public void rest() {
		innerdogbot.rest();
		Notify("rest");
	}
	
	//data의 변화가 있을 때에만 Notify 진행
	public void play() {
		innerdogbot.play();
		Notify("play");
	}
	
	//data의 변화가 없으므로 Notify 안함
	public String noise() {
		return innerdogbot.noise();
	}
	
	//data의 변화가 있을 때에만 Notify 진행
	public boolean eat() {
		boolean result = innerdogbot.eat();
		if(result) {
			Notify("eat");
		}
		return result;
	}
	
	//count 변수를 통해 Observer 수 반환
	public int countObservers() {
		return count;
	}
	
	
	//Notify 메소드
	//변화를 설정하고, Observer에게 String으로 변화를 알리고, 설정값 초기화.
	private void Notify(String s) {
		setChanged();
		notifyObservers(s);
		clearChanged();
	}

	//toString Override
	@Override
	public String toString() {
		return innerdogbot.toString();
	}

}
