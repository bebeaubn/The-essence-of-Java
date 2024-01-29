package java;

public class chapter02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수의 초기화 
		//변수란, 단하나의 값을 저장할수있는 메모리 공간
		// 변수의 초기화란, 변수를 사용하기전에 처음으로 값을 지정하는 것이다.
		int year = 0;
		int age = 14;
		
		System.out.println(year);
		System.out.println(age);
		
		year = age + 2000;  //변수 age의 값에 2000을 더해서 변수 year에 저장
		age = age + 1; //변수 age에 저장된 값을 1증가

	System.out.println(year);
	System.out.println(age);
	}

}
