import java.util.*;
class A06 {
	static int age = 0;
	public static void main (String[] arg) {
	new A06().jumsu();
}

        void jumsu () {
	
	Scanner Scanner = new Scanner(System.in);
	System.out.print("이름 : ");
	String name = Scanner.next();

	System.out.print("국어점수 입력 : ");
	int jumsu1 = Scanner.nextInt();
	
	System.out.print("수학점수 입력 : ");
	int jumsu2 = Scanner.nextInt();

	System.out.print("영어점수 입력 : ");
	int jumsu3 = Scanner.nextInt();

	float avg = (jumsu1 + jumsu2 + jumsu3)/3;

	String hukjum;

	if(avg>=95)
		hukjum="A+";
	else if(avg>=90)
		hukjum="A0";
	
	else if(avg>=85)
		hukjum="B+";
	else if(avg>=80)
		hukjum="B0";
	else if(avg>=75)
		hukjum="C+";
	else if(avg>=70)
		hukjum="C0";
	else if(avg>=65)
		hukjum="D+";
	else if(avg>=60)
		hukjum="D0";
	else
		hukjum="F";

	System.out.printf("[%s] 님의\n 평균은 %.1f 이며\n 학점은 %s 입니다.",name,avg,hukjum);
	
	}
}											
