//2016112154_������

import java.util.*;

public class ObservableDogBot extends Observable implements DogBot {
	private int count = 0;
	private DogBot innerdogbot;

	//������
	ObservableDogBot(DogBot d) {
		innerdogbot = d;
	}
	
	//Observer ���, Observer �� ����
	public void addObserver(DogWatcher dw) {
		dw.startWatching(this);
		count++;
	}
	
	//Observer ����, Observer �� ����
	public void deleteObserver(DogWatcher dw) {
		dw.stopWatching(this);
		count--;
	}
	
	//data�� ��ȭ�� ���� ������ Notify ����
	public void rest() {
		innerdogbot.rest();
		Notify("rest");
	}
	
	//data�� ��ȭ�� ���� ������ Notify ����
	public void play() {
		innerdogbot.play();
		Notify("play");
	}
	
	//data�� ��ȭ�� �����Ƿ� Notify ����
	public String noise() {
		return innerdogbot.noise();
	}
	
	//data�� ��ȭ�� ���� ������ Notify ����
	public boolean eat() {
		boolean result = innerdogbot.eat();
		if(result) {
			Notify("eat");
		}
		return result;
	}
	
	//count ������ ���� Observer �� ��ȯ
	public int countObservers() {
		return count;
	}
	
	
	//Notify �޼ҵ�
	//��ȭ�� �����ϰ�, Observer���� String���� ��ȭ�� �˸���, ������ �ʱ�ȭ.
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
