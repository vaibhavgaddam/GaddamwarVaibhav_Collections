package collections;
import java.util.*;
public class Main {
	public static void main(String args[])
	{
		List<Integer> custom_list=new ArrayList<Integer>(10);
		List<Integer> dummy=Arrays.asList(99,12,56,78,44,25,63,75,97,100);
		custom_list.addAll(dummy);
		custom_list.add(101);
		int fetching=custom_list.get(3);
		custom_list.remove(1);
		System.out.println("Fetching an element : "+fetching);
		custom_list.add(99);
		custom_list.add(1010);
		custom_list.add(77);
		custom_list.remove(6);
		System.out.println("List size : "+custom_list.size()+"\nPrinting elements : ");
		Iterator<Integer> it=custom_list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
	}
}
