//2016112154_정동구
//dogbot의 내용을 interface로 변경
interface DogBot {
	public boolean eat();
	public void rest();
	public void play();
	public String noise();
}

/*public class DogBot implements Observer {
	protected int hungry,tired;
	public DogBot(int h,int t)
	{
			hungry=h;
				tired=t;
	}

	public boolean eat()
	{
		if(hungry>6)
			{
				hungry-=3;
				return true;
			}
		else
			return false;
	}

	public void rest()
	{
		hungry++;
		tired-=2;
	}

	public void play()
	{
		hungry+=2;
		tired+=3;
	}

	public String noise()
	{
		if(hungry>8&&tired<11)
			return "whine ";
		else if(tired>7&&tired>hungry)
			return "snore ";
		else
			return "woof ";
	}

}*/
