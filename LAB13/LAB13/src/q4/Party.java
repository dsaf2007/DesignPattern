package q4;

public abstract class Party {
	public final void printNameAndDetails() {
		printName();
		printDetails();
	}
	
	public abstract void printName();
	public abstract void printDetails();
}
