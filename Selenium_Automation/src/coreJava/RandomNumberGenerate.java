package coreJava;

import java.util.Random;

public class RandomNumberGenerate {

	public static void main(String[] args) {
	//Print random number in 0 to 100 
		Random r = new Random();
		int a = r.nextInt(100);
		System.out.println(a);

	}

}
