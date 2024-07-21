package com.tej.singleton;

public class Printer {

	
    private static Printer printer;
    
    private Printer() {
    System.out.println("Printer::0 param Constructor");
    }
    
    public static Printer getInstance() {
    	
    	if(printer==null)
    		printer=new Printer();
    	return printer;    		
    }
}
