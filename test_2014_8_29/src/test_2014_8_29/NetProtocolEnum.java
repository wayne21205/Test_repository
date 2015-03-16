package test_2014_8_29;

import java.util.LinkedList;
import java.util.List;


public enum NetProtocolEnum {
	
	TCP("Transmission Control Protocol"),
	UDP("User Datagram Protocol");
	
	/*
	 *  The description type in Enum (This case, I use the type of String ) 
	 */
	private String description;

	
	private NetProtocolEnum(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return description;
	}
	
	
	public static void main(String[] args) {
		
		NetProtocolEnum temp = NetProtocolEnum.TCP;
		
		System.out.println( temp ); //Transmission Control Protocol
		System.out.println( temp.name() ); //TCP
	}
}


