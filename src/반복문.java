
public class 반복문 {
	public static void main(String[] args) {
		for(int i = 0; i <= 30; i += 2) {
			System.out.println(i);
			if(i == 10) {
				continue;
			} else if(i >= 14 | i == 10){
				break;
			}
		}
		
		System.out.println("-----------------");
		
		for(int i = 1; i <= 9; i++) {
			String 행 = "";
			for(int j = 1; j<= i; j++) {
				행 += j;
			}
			System.out.println(행);
		}
	}
}
