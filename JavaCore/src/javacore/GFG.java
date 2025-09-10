package javacore;

import java.util.Scanner;

public class GFG {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhap so a: ");
		int a = s.nextInt();
		System.out.println("Nhap so b: ");
		int b = s.nextInt();
		System.out.println("Nhap so c: ");
		int c = s.nextInt();
		s.close();
//		System.out.println("Nhap so d: ");
//		int d = s.nextInt();
		System.out.println("--------------- Input ------------");
		System.out.println("a= " + a + ", b= " + b + ", c= " + c);
		System.out.println("--------------- Output ------------");
		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (a >= b) {
			System.out.println(c);
		} else if (a >= c) {
			System.out.println(b);
		} else if (b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}
