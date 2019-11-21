import java.util.Scanner;

public class 시험준비 {
	public static void main(String[] args) {
		while(true) {
			맵표시();
			키입력();
		}
	
	}
	static String[][] 맵 = {
			{"8","8","8","8","8","8","8","8","8","8"},
			{"0"," "," "," "," ","8","8","8","　","　"},
			{"8"," ","8","8"," ","■","■","■","　","8"},
			{"8"," ","8","8"," ","■","■","■","　","8"},
			{"8"," ","8","8"," ","　","　","■","　","8"},
			{"8"," ","8","8"," ","■","　","■","　","8"},
			{"8"," ","8","8"," ","■","　","　","　","8"},
			{"8"," "," "," "," ","■","■","■","　","8"},
			{"8","8","8","8","8","8","8","8"," ","8"},
			{"8","8","8","8","8","8","8","8","8","8"}
	};
	static void 맵표시() {
		
		for(int i = 0; i < 맵.length; i++) {
			for(int j = 0; j < 맵[i].length; j++) {
				System.out.print(맵[i][j]);
			}
				System.out.println("");
		}
		System.out.println("");
	}
	static void 키입력() {
		int x = 1;
		int y = 0;
		Scanner scan = new Scanner(System.in);
		switch (scan.next()) {
		case "8": // 위쪽
			System.out.println("위쪽 이동!");
			if(맵[y - 1][x] != "0") {
				맵[y - 1][x] = "3";
				맵[y][x] = " ";
				y--;
			} else {
				System.out.println("쿵!");
			}
			break;
		case "6": // 오른쪽
			System.out.println("오른쪽 이동!");
			if(맵[y][x + 1] == "5"){
				System.out.println("Clear!!");
				break;
			} else if(맵[y][x + 1] != "0") {
				맵[y][x + 1] = "3";
				맵[y][x] = " ";
				x++;
			} else {
				System.out.println("쿵!");
			}
			break;
		case "5": // 아래쪽
			System.out.println("아래쪽 이동!");
			if(맵[y + 1][x] != "0") {
				맵[y + 1][x] = "3";
				맵[y][x] = " ";
				y++;
			} else {
				System.out.println("쿵!");
			}
			break;
		case "4": // 왼쪽
			System.out.println("왼쪽 이동!");
			if(맵[y][x - 1] != "0") {
				맵[y][x - 1] = "3";
				맵[y][x] = " ";
				x--;
			} else {
				System.out.println("쿵!");
			}
			break;
		case "0": // 종료
			System.out.println("프로그램 종료.");
			scan.close();
			break;
		default:
			System.out.println("잘못 입력하셨습니다");
			break;
		}
	}
}





