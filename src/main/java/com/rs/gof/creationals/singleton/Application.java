package com.rs.gof.creationals.singleton;

public class Application {

	public static void main(String[] args) {
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		System.out.println(sing1);
		System.out.println(sing2);
	}

}
