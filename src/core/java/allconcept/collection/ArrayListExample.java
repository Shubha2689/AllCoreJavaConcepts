package core.java.allconcept.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String args[]){  
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		
		list.add("Rani");//Adding the arraylist  
		list.add("Piya");  
		list.add("Shubhangi");  
		list.add("Shivanya");  
		//list Iterator  
		
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		
		}  

}
