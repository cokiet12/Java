
import java.util.Scanner;
public class 구구단 {
	public static void main(String[] args) {
		short 단 = 2;
		Scanner scan = new Scanner(System.in);
		System.out.println("구구단 표시 열 개수 입력 : ");
		short 열 = scan.nextShort();
		
		for(;단 <= 9; 단 += 열) {
			for(int 수 = 1; 수 <=9; 수++) {
				String 행 = "";
				for (int i = 0; i <= (열-1); i++) {
					행 += "\t"+(단+i)+" x "+수+" = "+((단+i)*수);
				}
				System.out.println(행);
			}
				System.out.println("--------------------------------------------------------------------------------------");
		}
//		short 열 = 3;
//		short 단 = 2;
//		short 수 = 1;
//		String 줄 = "";
//		
//		//for (단 = 2; 단 <= 9; 단 += 열) {
//				for (; 수 <= 9; 수++) {
//					String 행 = "";
//					for (; 단 <= (열+1); 단++) {
//						행 += 단+" x "+수+" = "+(단*수)+"\t";
//					}
//					System.out.println(행);
//					단 -= 열;
//				}
//				수 = 1;
//		//}
	}
}