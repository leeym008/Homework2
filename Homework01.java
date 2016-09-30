import java.util.*;
class Homework01 {
static int age = 0;
public static void main (String[] arg) {
new Homework01().birth();
}

	void birth () {
	Scanner Input = new Scanner(System.in);
	System.out.print("생년월일을 입력하세요: ");
	int year = Input.nextInt();
	int age = 2016 - year + 1;
	if (age < 20){
	System.out.println("미성년자 입니다.");
	}
	else{
	System.out.println("미성년자가 아닙니다. ");
	}
	
	}
}
