package collections;
import java.util.*;
public class Listiterator {

	public static void main(String[] args) {
		ArrayList<Integer> numbers=new ArrayList(Arrays.asList(0,1,2,3,4,5,6,7));
	ListIterator<Integer> iterator=numbers.listIterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	
while(iterator.hasPrevious())
{
	System.out.println(iterator.previous());
}
	}

}
