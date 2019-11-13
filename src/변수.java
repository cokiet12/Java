

public class 변수 {

	public static void main(String[] args) {
		
		short 년도=2000;
		short 윤년=0;
		while(년도<=2019 && 년도>=2000) {
			if(년도%4==0 && 년도%100!=0) {
				윤년++;
			} else if (년도%400==0) {
				윤년++;
			}
			년도++;
		}
		System.out.println(윤년);
		
	}
}
