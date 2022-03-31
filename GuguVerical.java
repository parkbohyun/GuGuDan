//2단 ~ 9단 세로 출력

public class GuguVerical {

	public static void main(String[] args) {
	
		for(int i=2; i<10; i++) {
			System.out.println("*****"+ i + "*****");
		
			for(int j=1; j<10; j++) {
				System.out.println(i + "x" +j+"="+i*j);
			}
			System.out.println();
		}
	}
}