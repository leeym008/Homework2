import java.util.*;
	public class Homework05 {
	static int birth_year;
	public static void main(String[] args) {
	Scanner Input = new Scanner(System.in);
	System.out.print("태어난 년도를 입력하세요 : ");
	birth_year = Input.nextInt();
	int age = 2016-birth_year+1;
	if (age > 0 && age <13)
	System.out.println("어린이입니다.");
	else if (age >= 13 && age <20)
	System.out.println("청소년입니다.");
	else if (age >= 20 && age <30)
	System.out.println("청년입니다.");
	else if (age >= 30 && age <60)
	System.out.println("중년입니다.");
	else if (age >= 60 )
	System.out.println("노년입니다.");
	else
	System.out.println("잘못 입력하였습니다.");
	}
}
