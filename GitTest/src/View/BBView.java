package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import DAO.BBDAO;
import DTO.BBDTO;

public class BBView {

	public static void main(String[] args) {

//	회원관리프로그램
//		실행공간
		Scanner sc = new Scanner(System.in);
		BBDAO dao = new BBDAO();
		System.out.println("'공'주는 야구 공주팀" );
		System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⠤⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⢀⠎⠀⠀⠀⠘⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⢠⣾⡖⢦⣰⣿⢲⠸⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⢨⠻⢷⣟⠙⠿⠞⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⢸⠦⠤⠷⠶⠶⠂⠀⢸⠀⠀⠀⠀⠀⠀⢀⢀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⡆⡄⢸⠀⠀⠀⠀⠀⢠⠃⢸⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⠀⡇⡇⢸⣇⡀⠀⠀⡠⠁⢠⠃⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⢸⠀⠀⠀⠀⣸⠃⢻⠈⠈⠉⢙⣳⣥⣄⣀⠔⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠸⡆⠀⠀⠰⣧⣶⠌⠂⠀⠀⠉⠁⠀⠀⠉⠳⡄⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠹⢦⣀⣀⣀⡀⠀⢀⣀⣀⡀⠀⢀⣀⡠⠚⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠉⡹⠉⠉⠉⠉⢉⠇⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠰⡉⠑⠁⢠⠃⠀⠀⣟⠓⠋⢠⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\r\n"
				+ "⠀⠀⠀⠀⠀⠀⠀⠈⠛⠒⠁⠀⠀⠀⠈⠓⠒⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
		System.out.println("====순위====");
		System.out.println("ID"+"\t"+"랭킹");
		
		ArrayList<BBDTO> dtoList = dao.selectAllMember();
		for (int i = 0; i < dtoList.size(); i++) {
			System.out.println
			(dtoList.get(i).getId() + "\t" );
			}

		System.out.println();
		
		while (true) {
			System.out.println("[1]회원가입 [2]로그인 [3]검색");
			int input = sc.nextInt();
			
			if(input == -1) {
				System.out.println("[1]강퇴[2]돌아가기");
				while(true) {
					int mng = sc.nextInt();
					System.out.println("탈퇴 ID : ");
					if (mng == 2) {
						break;
					} else {
						String id = sc.next();
						int row = dao.deleteMember(id);
						if (row > 0) {
							System.out.println("Delete Success");
						} else {
							System.out.println("Delete fail");
						}//else
					}//else
				}//while
			}//if
			/*************** 회원가입 ****************/
			if (input == 1) {
				System.out.print("ID 입력 : ");
				String id = sc.next();
				System.out.print("PW 입력 : ");
				String pw = sc.next();

				// DAO에 있는 join을 불러오기 위한 메소드 사용
				BBDTO mdto = new BBDTO(id, pw);
				int row = dao.join(mdto);

				if (row > 0) {
					System.out.println("Join succ");
				} else {
					System.out.println("Join fail");
				} // else
				
			} else if (input == 2) {/*************** 로그인 ****************/
				// 1. 사용자로부터 ID,PW 입력받기
				System.out.print("로그인 ID : ");
				String id = sc.next();
				System.out.print("로그인 PW : ");
				String pw = sc.next();
				BBDTO mdto = dao.login(id, pw);
				if (mdto != null) {
					System.out.println("Login Success");
				}else {
					System.out.println("Login fail");
				}
			} else if (input == 3) {/*************** 검색 ****************/
				System.out.println("검색할 ID : ");
				String id = sc.next();
				BBDTO dto = dao.selectOne(id);
			
				if (dto != null) {
					System.out.println("select Success");
				}else {
					System.out.println("select fail");
				}
				
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}//else
		} // while
	}// main
}// class
