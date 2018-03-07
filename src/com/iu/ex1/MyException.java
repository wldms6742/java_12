package com.iu.ex1;

public class MyException extends Exception{

	@Override
	public String getMessage() {
		
		return "사용자 정의 예외";
	}
	
}
