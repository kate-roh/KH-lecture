	//6.22 수업
	//7.5 복습

	package com.test02;

	public class TestMain {

		public static void main(String[] args) {
			//1. 입력받은 수가 5의 배수라면 "5의 배수입니다."를 출력하자.
			new Test().test01(10);
			
			//2. 입력받은 수가 2의 배수이면서 3의 배수이면 " 2와 3의 배수입니다."를 출력하자
			//아니면, "2와 3의 배수가 아닙니다."를 출력
			new Test().test02(6);
			
			//3. 입력받은 문자가 소문자라면 "소문자입니다. ", 대문자라면 "대문자 입니다."를 출력하자
			//Charcater class의 메소드 활용
			new Test().test03('a');
		
		}

	}

