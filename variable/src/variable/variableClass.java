package variable;

public class variableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int level; //정수형 변수 선언
		level = 10; //level 변수에 10 대입
		//int hp = 400; //정수형 변수 초기화

		System.out.println(level);
		
		//byte a; //1byte 정수형
		short b; //2byte 정수형
		//int c; //4byte 정수형
		long d; //8byte 정수형
		
		char e; //2byte 문자형
		
		float f; //4byte 실수형
		double g; //8byte 실수형
		
		boolean h; //1byte 불린
		
		e = 'A'; //문자 표현 '', 문자열 표현 ""
		d = 123L;
		System.out.println(e);
		System.out.println((int)e);
		e = 66;
		System.out.println(e);
		System.out.println((int)e);
		b = 67;
		System.out.println(b);
		System.out.println((char)b);
		f = 3.14F; //식별자 F를 붙여야 함
		g = 3.14;
		h = true;
		System.out.println(h);
		
		//자료형 추론(variable type inference)
		var num = 10;
		var floNum = 10.0F;
		var str = "Yes";
		System.out.println(num);
		System.out.println(floNum);
		System.out.println(str);
		//상수(constant)
		final int FIN_INT = 4; //final 예약어 사용
		//FIN_INT = 10;
		
		//형 변환(type conversion)
		int cd = 400;
		byte sd = (byte)cd;
		System.out.println((byte)cd);
		System.out.println(sd);
	}

}
