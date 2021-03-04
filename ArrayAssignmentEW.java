//Evan White
import java.util.ArrayList;
public class ArrayAssignmentEW {

	public static void main(String[] args) {
		
   ArrayList<String>list= new ArrayList<String>();
		
        list.add("Grapes");
	 list.add("Orange");
	  list.add("Apple");
	 list.add("Strawberry");
	list.add("Watermelon");
		
   System.out.println("Array Size: " + list.size());
		
		list.remove(2);
		
   System.out.println("Array Size: " + list.size());
		
		list.set(0, "GRAPES");
		
        for(int i = 0; i < list.size(); i++)
     {
         System.out.println(list.get(i));
     }
		
		list.clear();
		
   System.out.println("Array Size: " + list.size());
	}

}

/*
Array Size: 5
Array Size: 4
GRAPES
Orange
Strawberry
Watermelon
Array Size: 0
*/
