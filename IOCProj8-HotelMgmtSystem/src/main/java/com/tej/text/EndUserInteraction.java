package com.tej.text;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.tej.VO.GuestVO;
import com.tej.controller.HotelGuestController;

public class EndUserInteraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/tej/cfgs/applicationContext.xml");
		Scanner scn=new Scanner(System.in);
		GuestVO vo=new GuestVO();
		System.out.println("Enter the Guest Name::");
		vo.setgName(scn.next());
		System.out.println("Enter the Guest Address::");
		vo.setGaddrs(scn.next());
		System.out.println("Enter how many days guest will stay::");
		vo.setNofDays(scn.next());
		System.out.println("Enter guest per Day charge::");
		vo.setPerDcharge(scn.next());
		try {
			
		System.out.println(factory.getBean("controller",HotelGuestController.class).ValiDateRegistration(vo));
		}catch(Exception e) {
			System.out.println("User Not Regitered");
			e.printStackTrace();
		}
		
		
	}

}
