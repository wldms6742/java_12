package com.iu.ex1;

public class Exception_4 {

	public static void main(String[] args) {
		int num1=70;
		int num2=40;
		//초딩 1학년 - 산수 2자리까지는 가능
		try {
			int sum = num1+num2;
			if(sum>99) {
				throw new Exception();
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
