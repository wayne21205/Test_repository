package test_2014_8_29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.*;



public class eumuSwitch {
	
	public static enum Fruit {
	    apple, carrot, mango, orange;
	}
	
	public static void main(String... args) {
	  /*
	  Set<String> copy = new HashSet<String>(); //Set
	  System.out.println( copy );
	  
	  //isEmpty() is the crucial method to verify set is null or not
	  if ( copy.contains(null) || copy==null || copy.isEmpty() ) {
	      throw new NullPointerException("null is not a valid plugin");
	  }*/
	  
	  System.out.println( WoodEnum.INDIAN_ROSEWOOD );
	  
	  
	  
	  /** 
	   * Turn the Set into List
	   * */
	  Set<String> aSet = new HashSet<String>();
	  aSet.add("A");
	  aSet.add("B");
	  List<String> subnetList = new ArrayList<String>( aSet ); // Let set turned into list
	  
	  System.out.println( subnetList );
	  System.out.println( subnetList.get(0) );
	  
	  
	  
	  /** 
	   * Enum integrated with switch-case
	   * */
		String value = "apple"; // assume input
		Fruit fruit = Fruit.valueOf( value ); // String Turned into Enum type

		switch(fruit) {
		    case apple:
		    	System.out.println( "1" );
		        break;
		        
		    case carrot:
		    	System.out.println( "2" );
		        break;
		    // etc...
		}
	  
	}
}
