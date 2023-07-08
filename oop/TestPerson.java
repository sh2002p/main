package com.rays.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		Person s = new Person() ;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		s.setstr("shardha");
		s.setD(sdf.parse("18/03/2002"));
		s.setaddress("indore");
		
		System.out.println(s.getstr());
		System.out.println(s.getd());
		System.out.println(s.getaddress());
		System.out.println(s.getAVG_AGE());
		
		
	}
}
	