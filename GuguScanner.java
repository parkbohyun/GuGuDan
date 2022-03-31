//입력받은 구구단을 출력

import java.util.Scanner;

public class GuguScanner {

	public static void main(String[] args) {
		 try (Scanner scan = new Scanner(System.in)) {
			System.out.print("출력하고자 하는 단을 입력하세요 : ");
			 int j = scan.nextInt();
			 
			 for(int i = 1 ; i <10 ; i++ )
			 {
			 System.out.println(j + "*" + i + "=" + j*i);
			 }
		}
	}
}
