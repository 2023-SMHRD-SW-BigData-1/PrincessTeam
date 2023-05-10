package yean;

import java.util.ArrayList;
import java.util.Scanner;

public class Game_main {


		public static void main(String[] args) {

			GameDAO dao = new GameDAO();
			ArrayList<GameDTO> dtoList = dao.selectAllMember();
			Scanner sc = new Scanner(System.in);

			int score = 0;
			int num = 1;
			int st = 0;
			
			while (true) {
				if( score < 10) {
					System.out.print("TO 능력치 : ");
					int TO = sc.nextInt();
					
					System.out.print("TA 능력치 : ");
					int TA = sc.nextInt();
					
					int G = TO - TA;
					
					
					System.out.println(num++ + "번째 게임 ");
					

				if (Math.abs(G) <= 20) {
				
					System.out.println("홈런! +3점");
					score = score + 3;
					System.out.println( "누적점수 : " +score);
					System.out.println("=======================");
					
				} else if (Math.abs(G) <= 50 && Math.abs(G) > 20) {

					System.out.println("안타! +1점");
					score = score + 1;
					System.out.println( "누적점수 : " +score);
					System.out.println("=======================");

				} else if (Math.abs(G) >= 80) {
					
					System.out.println("스트라이크");
					System.out.println( "누적점수 : " +score);
					st = st +1;
					System.out.println("=======================");
					
					if (st >= 3) {
						
						System.out.println("종료");
						System.out.println("누적점수 : " +score);
						System.out.println("=======================");
						break;
					}

				}

				} else if (score >= 10) {
					
					if (score >= 10) {
				
					System.out.println("종료");
					System.out.println("누적점수 : " +score);
					System.out.println("=======================");
					break;
					
		
					
		
			}
		}

		// ============================= 랭킹 메인 ==================================================

			System.out.println("RANKING\t" + "ID\t" + "SCORE\t" + "\n");

			for (int i = 0; i < dtoList.size(); i++) {

				System.out.print(dtoList.get(i).getRn() + "\t ");
				System.out.print(dtoList.get(i).getId() + "\t ");
				System.out.print(dtoList.get(i).getScore() + "\t ");
				System.out.println();

			}


	}
		}

	}


