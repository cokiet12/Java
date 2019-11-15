

public class 윤년 {

	public static void main(String[] args) {
		
		short 시작=2000;
		short 끝=2019;
		short 년도=시작;
		short 윤년=0;
		while(년도<=끝 && 년도>=시작) {
			if(년도%4==0 && 년도%100!=0) {
				윤년++;
			} else if (년도%400==0) {
				윤년++;
			}
			년도++;
		}
		System.out.println(시작+"년부터 "+끝+"년까지의 윤년 수 : "+윤년);
		
	}
}
