package com.equator.common;

import java.util.ArrayList;
import java.util.List;

public class StartApp {

	public static void main(String[] args) {
		List<String> ss = new ArrayList<String>();
		ss.add("1");
		ss.add("2");
		ss.add("3");
		
		ss.forEach(c -> System.out.println(c.startsWith("2")));

	}

}
