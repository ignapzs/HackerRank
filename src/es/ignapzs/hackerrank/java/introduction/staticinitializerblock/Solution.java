package es.ignapzs.hackerrank.java.introduction.staticinitializerblock;

import java.util.Scanner;

public class Solution {
	static int B, H;
	static boolean flag;

	static {
		Scanner reader = new Scanner(System.in);
		B = reader.nextInt();
		H = reader.nextInt();
		if (B <= 0 || H <= 0) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		} else {
			flag = true;
		}
		reader.close();
	}

	public static void main(String[] args) {

	}

}
