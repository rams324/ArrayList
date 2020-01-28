package collections;

import java.util.ArrayList;

public class Capacity1 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		list1.add("ram prasad");
		list1.add("murali");
		list1.add("teja");
		list1.add("hari");
		list1.add("dad");
		System.out.println(list1);
		list1.ensureCapacity(3);
		list1.add("mom");
		System.out.println(list1);
		

	}

}
