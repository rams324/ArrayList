package collections;
import java.util.*;
public class remove {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		list1.add("ram prasad");
		list1.add("murali");
		list1.add("teja");
		list1.add("teja");
		list1.add("teja");
		list1.add("hari");
		list1.remove("teja");
		System.out.println(list1);
		list1.removeAll(Collections.singleton("teja"));

		System.out.println(list1);
	}

}
