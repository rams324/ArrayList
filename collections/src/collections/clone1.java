package collections;
import java.util.*;
public class clone1 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		list1.add("ram prasad");
		list1.add("murali");
		list1.add("teja");
		list1.add("hari");
		System.out.println(list1);
		ArrayList<String> ArrayListClone=( ArrayList<String>) list1.clone();
		System.out.println(ArrayListClone);
		

	}

}
