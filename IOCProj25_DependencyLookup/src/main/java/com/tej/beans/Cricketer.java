package com.tej.beans;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("cricket")
@PropertySource(value="com/tej/Commons/Info.properties")
public abstract class Cricketer {
	@Value("${cricketer.name}")
	String name;
	@Value("${jersyno}")
	int jersyno;
	
	//private ApplicationContext acc;
	
	@Lookup
	 public abstract CricketBat getCricketBat();
	 
	
	public Cricketer() {
		System.out.println("Cricketer::0 param constructor");		
	}
	
	
	public void fielding() {
		System.out.println(name+" with jersy NO "+jersyno+" is fieldig");
	}
	public void bowling() {
		System.out.println(name+" with jersy NO "+jersyno+" is bowling");
	}
    public void wicketKeeping() {
    	System.out.println(name+" with jersy No "+jersyno+"  is WicketKeeping");
    }
    public void batting() {
    	
		/*
		 * ClassPathXmlApplicationContext ctx=new
		 * ClassPathXmlApplicationContext("com/tej/cfgs/applicationContext.xml");
		 * CricketBat bat=ctx.getBean("bat",CricketBat.class);
		 */
    	CricketBat bat=getCricketBat();    	
    	System.out.println(name+" with jersy NO "+jersyno+" is Batting and his Score is ::"+bat.scoreRuns());
    }
}
