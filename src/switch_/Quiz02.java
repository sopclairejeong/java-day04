package switch_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println("수 입력");
			num = input.nextInt();
			
		switch(num % 7){
			case 1 :
				System.out.println("월요일");break;
			case 2 :
				System.out.println("화요일");break;
			case 3 :
				System.out.println("수요일");break;
			case 4 :
				System.out.println("목요일");break;
			case 5 :
				System.out.println("금요일");break;
			case 6 :
				System.out.println("토요일");break;
			case 0 :
				System.out.println("일요일");break;
			default :
				System.out.println("잘못된 입력");
			}
		}
	}
}