package com.rs.gof.creationals;

public class SingletonApplication {

	public static void main(String[] args) {
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		System.out.println(sing1);
		System.out.println(sing2);

	}

}
