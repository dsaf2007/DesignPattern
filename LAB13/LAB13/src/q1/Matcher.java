package q1;

public class Matcher {

	 public boolean match(int[] expected, int[] actual, 
		        int clipLimit, int delta) 
		    {
		       for (int i = 0;i < actual.length; i++)
		       {
		           if (actual[i] > clipLimit)
		           actual[i] = clipLimit;
		           
		           if ((actual.length != expected.length) || (Math.abs(expected[i] - actual[i]) > delta))
		           return false;
		       }
		       return true;
		    }
}
