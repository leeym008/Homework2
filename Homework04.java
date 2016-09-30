import  java.util.*;
public class Homework04 {
public static void main(String[] args) {


	Scanner a = new  Scanner(System.in);
	System.out.print("국어 점수를 입력하세요 : ");
	int kor = a.nextInt();
	System.out.print("영어 점수를 입력하세요 : ");
	int eng = a.nextInt();
	System.out.print("수학 점수를 입력하세요 : ");
	int math = a.nextInt();



	int total =  kor + eng + math;
	float avg = total/3;
	System.out.printf("입력하신 점수의 총점은 %d 이며 \n", total);
	System.out.printf("평균은 %.2f 입니다. \n", avg);


	if (kor >=90)
		System.out.println("국어 점수가 우수합니다.");
	if (eng >=90)
		System.out.println("영어 점수가 우수합니다.");
	if (math >=90)
	System.out.println("수학 점수가 우수합니다.");
	}
}
