package operator;

public class operatorClass {
	public static void main(String[] args) {

		int num1 = 5;
		int num2 = 6;
		//단항 연산자
		System.out.println(++num1);
		System.out.println(num2++);
		System.out.println(num2);
		//이항 연산자
		//+ 연산자
		System.out.println(num1 + num2);
		//- 연산자
		System.out.println(num2 - num1);
		//논리 연산자
		System.out.println(5 > 3 && 3 > 2);
		//조건 연산자
		//조건?결과1:결과2;
		boolean value = (1<2) ? true : false;
		System.out.println(value);
		//비트 연산자(시프트 연산자)
		//<<
		int num3 = 3;
		System.out.println(Integer.toBinaryString(num3));
		num3 = num3 << 2;
		System.out.println(Integer.toBinaryString(num3));
		//>>
		num3 = 4875;
		System.out.println(Integer.toBinaryString(num3));
		num3 = num3 >> 2;
		System.out.println(Integer.toBinaryString(num3));
		//>>>
		num3 = 4875;
		System.out.println(Integer.toBinaryString(num3));
		num3 = num3 >>> 2;
		System.out.println(Integer.toBinaryString(num3));
		
	}
}
