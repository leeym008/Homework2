import java.util.*;
class Homework02 {
static double input_degree;
static double output_degree;
public static void main (String[] arg) {
new Homework02().choice();
}

void choice() {
System.out.print("온도를 입력하세요 :");
Scanner Input = new Scanner(System.in);
input_degree = Input.nextDouble();

System.out.print("입력한 온도가 섭씨이면 C 를, 화씨면 F를 입력하세요 : ");
Scanner Input2 = new Scanner(System.in);
String kind = Input2.next();

	if (kind.equals("F")){
	output_degree=(input_degree*1.8+32);
	System.out.printf("섭씨 %d 도 입니다.\n",output_degree);
	}
	else {
	output_degree=(input_degree-32)/1.8;
	System.out.printf("화씨 %d 입니다.\n",output_degree);
	}

	}
}

