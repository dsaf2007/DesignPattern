//2016112154_������
import java.util.*;

//Observer�� �̿� ���� ǥ�ð� �� �ߴ����� �𸣰����� �۵��� �ߵ�.
//DogWathcer�� Observer�̴�.
public class DogWatcher implements Observer {
	protected String name;
	
	DogWatcher(String n) {
		name = n;
	}
	
	//Observable ��ü�� Observer ���
	public void startWatching(Observable d) {
		d.addObserver(this);
	}
	
	//Observable ��ü���� Observer ����
	public void stopWatching(Observable d) {
		d.deleteObserver(this);
	}
	
	//Update �˸�
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
