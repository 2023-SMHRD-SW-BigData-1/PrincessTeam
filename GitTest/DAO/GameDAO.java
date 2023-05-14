package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.GameDTO;



public class GameDAO {
	// 공통 필드
			Connection conn = null; 
			PreparedStatement psmt = null;
			ResultSet rs = null;

		//============================ getConn 메소드 ======================================
			// DB 연결 메소드 만들기
			public void getConn() {

				// 1. 드라이버 동적 로딩
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					// 2. DB 연결 통로 열어주기

					String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
					String db_id = "service";
					String db_pw = "12345";

				 conn = DriverManager.getConnection(url, db_id, db_pw);
					// Connection ? 데이터베이스에 접속하기 위한 모든 메소드를 가진 인터페이스
					// => DB와 하는 모든 통신은 conn을 통해서만 이루어짐

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		//============================ getClose 메소드 ======================================


			public void getClose() {

				try {
					if (psmt != null)
						psmt.close();

					if (conn != null)
						conn.close();

				} catch (SQLException e) {
					
					e.printStackTrace();

				}
			}

			//============================ 랭킹 메소드 ======================================

			public ArrayList<GameDTO> selectAllMember() {

				GameDTO mdto = null;
				
				ArrayList<GameDTO> dtoList = new ArrayList<>();
				
				String sql = "select rownum, x.* from (select * from MEMBER_INFO_BB t order by SCORE) x";
				getConn();

				try {
					psmt = conn.prepareStatement(sql);

					rs = psmt.executeQuery();

					while (rs.next()) {
						
						String s_id = rs.getString(1);
						String s_pw = rs.getString(2);
						int s_score = rs.getInt(3);
						
						mdto = new GameDTO(s_id, s_pw, s_score);
						
						dtoList.add(mdto);
					

					}

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					getClose();
				}
				return dtoList;

			}
			
			//======================== game rule =================================================
		

		
		
		
		
		
		
		
}
