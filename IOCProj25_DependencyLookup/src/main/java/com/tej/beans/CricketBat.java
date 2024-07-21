package com.tej.beans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("bat")
public class CricketBat {

	public CricketBat() {
		super();
		System.out.println("CricketBat.0 param Constructor");
		System.out.println("Using Dependency Lookup.");
	}

	public int scoreRuns() {
		return new Random().nextInt(100);
	}
	
}
