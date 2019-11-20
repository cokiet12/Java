
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
		
		System.out.println("----------1---------");
		
		for(int i = 1; i <= 9; i++) {
			String 행 = "";
			for(int j = 1; j<= i; j++) {
				행 += j;
			}
			System.out.println(행);
		}
		
		System.out.println("----------2---------");
		
		for(int i = 1; i <= 10; i++) {
			String O = "";
			for(int j = 1; j<= i; j++) {
				O += "O";
			}
			System.out.println(O);
		}
		System.out.println("----------3---------");
		
		for(int i = 1; i <= 10; i++) {
			String O = "";
			for(int j = 1; j<= i; j++) {
				O += " ";
			}
			for(int k = 1; k<= (10-i); k++) {
				O += "O";
			}
			System.out.println(O);
		}
		System.out.println("----------4---------");
		
		for(int i = 1; i <= 10; i++) {
			String O = "";
			for(int j = 1; j<= (10-i); j++) {
				O += "O";
			}
			System.out.println(O);
		}
		System.out.println("----------5---------");
		for(int i = 1; i <= 10; i++) {
			String O = "";
			for(int j = 1; j<= (10-i); j++) {
				O += " ";
			}
			for(int k = 1; k<= i; k++) {
				O += "O";
			}
			System.out.println(O);
		}
		System.out.println("----------6---------");
		int k = 0;
		for(int i = 0; i <= 18; i++) {
			String O = "";
			for(int j = 0; j <= 18; j++) {
				if(j == 9 | (j <= (9 + k) & j >= (9 - k))) {
					O += "O";
				} else {
					O += " ";
				}
			}
			System.out.println(O);
			if (i < 9) {
				k++;
			} else {
				k--;
			}
		}
		System.out.println("----------7---------");
		int l = 0;
		for(int i = 0; i <= 18; i++) {
			String O = "";
			for(int j = 0; j <= 18; j++) {
				if(j == 9 | (j <= (9 + l) & j >= (9 - l))) {
					O += " ";
				} else {
					O += "O";
				}
			}
			System.out.println(O);
			if (i < 9) {
				l++;
			} else {
				l--;
			}
		}
		System.out.println("----------8---------");

		for(int i = 0; i <= 12; i++) {
			int i2 = i - 10;
			if(i <= 3) {
				String O = "";
				for(int j = 0; j <= 16; j++) {
						if(j == 8 | (j <= (8 + i) & j >= (8 - i))) {
							O += "O";
						} else {
							O += " ";
						}
				}
				System.out.println(O); continue;
			} else if(i <= 7) {
				String O = "";
				for(int j = 0; j <= 16; j++) {
						if(j == 8 | (j <= (20 - i) & j >= (-4 + i))) {
							O += "O";
						} else {
							O += " ";
						}
				}
				System.out.println(O); continue;
			} else if(i <= 9) {
				String O = "";
				for(int j = 0; j <= 16; j++) {
						if(j == 8 | (j <= (4 + i) & j >= (12 - i))) {
							O += "O";
						} else {
							O += " ";
						}
				}
				System.out.println(O); continue;
			} else if(i <= 12) {
				String O = "";
				for(int j = 0; j <= 16 && i != 13; j++) {
					if((j <= (17 - (i+(i2*2)))) & (j >= (12 - i)) | (j <= (4 + i)) & (j >= (-1 + (i+(i2*2))))) {
							O += "O";
						} else {
							O += " ";
						}
				}
				System.out.println(O); continue;
			} 
		}
		System.out.println("----------9---------");
		for(int i = 0; i <= 8; i++) {
			String O = "";
			for(int j = 0; j <= 17; j++) {
				if(i%2 == 0 | (j%2 == 0 && j <= 8) | j == 17) {
					O += "O";
				} else {
					O += " ";
				}
			}
			System.out.println(O);
		}
	}
}
