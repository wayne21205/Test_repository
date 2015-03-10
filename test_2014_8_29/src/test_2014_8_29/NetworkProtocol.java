package test_2014_8_29;

import java.util.LinkedList;
import java.util.List;


public enum NetworkProtocol {
	TCP("Transmission Control Protocol"),
	UDP("User Datagram Protocol");
	
	private String description;

	private NetworkProtocol(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return description;
	}
	
	
	public static void main(String[] args) {
		
		NetworkProtocol temp = NetworkProtocol.TCP;
		System.out.println( temp.name() );
	}
}


