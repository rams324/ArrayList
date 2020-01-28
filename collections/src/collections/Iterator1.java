package collections;
import java.util.*;
public class Iterator1 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList(Arrays.asList(0,1,2,3,4,5,6,7));
	Iterator<Integer> iterator=numbers.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	//System.out.println("no values in the list");
	}

}
