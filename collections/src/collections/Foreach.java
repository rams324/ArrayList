package collections;
import java.util.ArrayList;
import java.util.Arrays;

public class Foreach {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7));
		list1.forEach(name-> System.out.println(name));
		//list1.forEach(System.out:: println);
	}

}
