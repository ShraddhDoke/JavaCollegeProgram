package collection;

import java.util.*;

public class ArrayListDemo {
	 public static void main(String args[]) {
	      ArrayList list = new ArrayList();

	      list.add("hello");
	      list.add("dear");
	      list.add("root");
	      list.add(10);
	      list.add(22);  
	    
	      System.out.println("ArrayList:" + list);
	      System.out.println("root is at index: " + list.indexOf(10));
	  
	   }
}