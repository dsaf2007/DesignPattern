import java.util.*;

public class MergeSort implements SortStrategy{
	
	@Override
	public void sort(List<String> list)
	{
		list.sort(new Comparator() {
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		});
		System.out.println("MergeSort ");
	}

}
