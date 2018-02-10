package com.cadastromv.model.utility;

public class Conversor {
	
	public static String conversorSQL (String data) {
		
		return data.substring(6, 10) + "-" + data.substring(3, 5) + "-" + data.substring(0, 2);
	}
	
	public static String conversorJava (String data) {
		
		return data.substring(8, 10) + "/" + data.substring(5, 7) + "/" + data.substring(0, 4);
	}

}
