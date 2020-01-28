package collections;
import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		list1.add("ram prasad");
		list1.add("murali");
		list1.add("teja");
		list1.add("hari");
		ArrayList<String> list2=new ArrayList<>();
		list2.add("shekar");
		list1.addAll(list2);
	System.out.println(list1);

	}

}
