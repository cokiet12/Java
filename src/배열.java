
public class 배열 {
	public static void main(String[] args) {
		int 배열[] = new int[10];
		int 임시배열[] = new int[] {0,1,2,3,4,5,6,7,8,9};
		//int 임시배열[] = {0,1,2,3,4,5,6,7,8,9};
		for(int i = 0; i <= 9; i++) {
			배열[i] = i;
		}
		for(int i = 0; i < 배열.length; i++) {
			배열[i] = 임시배열[i] * 임시배열[9-i];              
			System.out.println(배열[i]);
		}
		
		System.out.println("------------------");
		
		int x축[] = {0,1,0,2,0,3,0,4,0,5};
		int 임시배열2[] = {0,1,0,2,0,3,0,4,0,5};
		for(int i = 0; i < x축.length; i++) {
			if(i == x축.length-1) {
				x축[i] = 임시배열2[(x축.length-1)-i];
			} else {
				x축[i] = 임시배열2[i+1];
			}
			System.out.println(x축[i]);
		}
		
		System.out.println("------------------");

		int 배열2[] = {8,3,4,6,2,7,5,1,9};
		int 임시배열3[] = new int[9];
		while(임시배열3[0] != 1) {
			for (int i = 0; i <= 8; i++) {
				for (int k = 0; k <= 8; k++) {
					if(배열2[i]==(k+1)) {
						임시배열3[k]=배열2[i];
					}
				}
			}
		}
		for (int i = 0; i <= 8; i++) {
			배열2[i]=임시배열3[i];
		}
		for (int i = 0; i <= 8; i++) {
			System.out.println(배열2[i]);
		}
	}
}
