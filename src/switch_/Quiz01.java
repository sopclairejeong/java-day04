package switch_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		String home = null, office = null;
		
		while(true) {
		System.out.println("1.집 등록");
		System.out.println("2.회사등록");
		System.out.println("3.등록보기");
		num = input.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("집 주소 입력 : ");
			home = input.next();
			System.out.println("집 등록 성공");
			break;
		
		case 2 :
			System.out.println("회사 주소 입력 : ");
			office = input.next();
			System.out.println("회사 등록 성공");
			break;
		
		case 3 :
			if(home == null) {
				System.out.println("집 주소가 등록되지 않았습니다");
			}else {
				System.out.println("집 : " + home);
			}
			if(office == null) {
				System.out.println("회사 주소가 등록되지 않았습니다");
			}else {
			System.out.println("회사 : " + office);
			}
			break;
			}
		}
	}
}