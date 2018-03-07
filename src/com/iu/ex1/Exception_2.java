package com.iu.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요");
		int sum=0;

		try {//수행
			int num = sc.nextInt();
			sum = 12/num;
		}catch(Exception e) {//예외발생
			// 에러 메세지의 발생 근원지를 찿아
			//단계별로 에러를 출력한다
			e.printStackTrace();
			System.out.println("예기치 않은 오류 발생");
		}


		System.out.println(sum);


	}

}
