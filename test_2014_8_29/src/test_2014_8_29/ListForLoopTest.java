package test_2014_8_29;

import java.util.LinkedList;
import java.util.List;

public class ListForLoopTest {

	
	public static void main(String[] args) {
		
		List<String> intfs = new LinkedList<String>();
		
		for(String devIntf : intfs ) {
			System.out.println("Hi");
		}
		
		String temp = "abcdef";
		System.out.println( temp.substring(0, 2) );
		System.out.println( temp.substring(0, 2) );
		
	}
}
