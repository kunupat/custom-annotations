package com.test;

import com.test.annotations.PCI;

public class TesterClass{
	@PCI(enabled=false)
	public static void testerMethod() {
		System.out.println("Not invoked by processing annotation...");
	}
	
	@PCI(enabled=true)
	public static void testerMethod2() {
		System.out.println("Invoked by processing annotation...");
	}
}
