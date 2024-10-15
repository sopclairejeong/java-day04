package switch_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		while(true) {
			System.out.println("이름 입력");
			name = input.next();
			System.out.println("입력한 이름 : " + name);
			switch(name) {
			case "홍길동" :
				System.out.println(name + "님 반갑습니다");
			default :
				System.out.println("누구십니까?");
			}
		}
	}
}