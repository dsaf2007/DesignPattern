import java.util.*;

public class SortedList {

	private List<String> list = new ArrayList<>();
    private SortStrategy sortstrategy;
    
    public void setSortStrategy(SortStrategy sortstrategy)
    {
    	this.sortstrategy = sortstrategy;
    }
    
    public void add(String name)
    {
    	list.add(name);
    }

    public void sort(){
    	sortstrategy.sort(list);
    	// Iterate over list and display results
    	for(String name : list) 
    	{
    		System.out.println(" " + name);
    	}
    	System.out.println();
    }
}
