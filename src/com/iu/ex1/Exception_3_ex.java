package com.iu.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_3_ex {
	
	public void test() throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int sum=0;
		
		int num = sc.nextInt();
		
		
		sum = 12/num;
		
		
		
		System.out.println(sum);
	}

}
