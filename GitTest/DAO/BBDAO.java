package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.BBDTO;

public class BBDAO {
	// 공통필드 //close에서도쓸거니까
	Connection conn = null;
	PreparedStatement psmt = null;
	PreparedStatement psmt2 = null;
	Statement pst = null;
	ResultSet rs = null;

// DB연결 메소드
	/*---------------------------------회원가입메소드 시작------------------------------*/
	/*-------------getConn메소드 시작----------------------*/
	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String db_id = "service";
			String db_pw = "12345";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

			conn = DriverManager.getConnection(url, db_id, db_pw);
			// 데이터베이스와 하는 모든 통신은 conn을 통해서만 이루어진다.
		} catch (Exception e) {
			e.printStackTrace();
		} // catch
	}// getConn
	/*-------------getConn메소드 끝-------------------------*/
	/*-------------getClose메소드 시작----------------------*/
// DB연결 종료 메소드	

	public void getClose() {
		try {
			if (psmt != null) /* 열렸다면~ */
				psmt.close();/* ~ 그때 닫겠다 */
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace(); //오류를 안보이게하는 문장
		} // catch
	}// getClose();
	/*-------------getClose메소드 시작----------------------*/

//	메소트 형태로 코드 작성
	
	public void create() {
		try {
			getConn();
			// 3. sql문 준비
			// 회원가입 >> member_info 테이블에 데이터 추가
				
			String sql = "CREATE TABLE MEMBER_INFO_BB (ID VARCHAR2(200) NOT NULL, PW VARCHAR2(200) NOT NULL, SCORE NUMBER(8))";
			pst = conn.createStatement();
			// 4. SQL문 전송(실행)
			/* 전송하기전 sql문을 담아서 전송할 수 있는 형식으로 변경 */

			pst.execute(sql); // 쿼리
			
			 
			 
		} catch (Exception e) {
		} finally {
			try {
				if (pst != null) /* 열렸다면~ */
					pst.close();/* ~ 그때 닫겠다 */
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // finally
	}
	
	
	/*---------------------------------1회원가입메소드 시작------------------------------*/
//	회원가입 메소드
	public int join(String id, String pw) {
		int row = 0;

		try {
			getConn();
			// 3. sql문 준비
			// 회원가입 >> member_info 테이블에 데이터 추가
			String sql = "SELECT COUNT(*) FROM MEMBER_INFO_BB WHERE ID = ?";
			String sql2 = "INSERT INTO MEMBER_INFO_BB VALUES(?,?,?)";
			// 4. SQL문 전송(실행)
			psmt = conn.prepareStatement(sql);
			psmt2 = conn.prepareStatement(sql2);
			/* 전송하기전 sql문을 담아서 전송할 수 있는 형식으로 변경 */
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			rs.next();
            int count = rs.getInt(1);
//			String count = rs.getString(1);
			
				if (count == 0) {

			
            	psmt2.setString(1, id);
            	psmt2.setString(2, pw);
            	psmt2.setInt(3, 0);
            	row = psmt2.executeUpdate(); // 쿼리

            } else {
            }

		} catch (Exception e) {
		} finally {
			getClose();
		} // finally
		return row;
	}// join
	/*---------------------------------1회원가입메소드 끝------------------------------*/
	
	/*---------------------------------2로그인메소드 시작------------------------------*/
	public BBDTO login(String id, String pw) {
		getConn();
		String sql = "SELECT * FROM MEMBER_INFO_BB WHERE ID = ? AND PW = ?";
		BBDTO mdto = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			rs = psmt.executeQuery();
			if(rs.next()) {//중복이 없다는 가정 하에 if문도 사용 가능합니다.
				String s_id = rs.getString(1);
				String s_pw = rs.getString(2);
				mdto = new BBDTO(id, pw);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			getClose();
		}
		return mdto;
	}//login

	/*---------------------------------2로그인메소드 끝------------------------------*/
	/*---------------------------------3랭킹메소드 시작------------------------------*/
	public ArrayList<BBDTO> selectAllMember() {

//		String sql = "SELECT * FROM MEMBER_INFO_BB";
	    String sql = "SELECT ROWNUM AS RANKING, ID, SCORE FROM ( SELECT ID, SCORE FROM MEMBER_INFO_BB ORDER BY SCORE DESC) WHERE ROWNUM <=10";        

		BBDTO mdto = null;
		ArrayList<BBDTO> dtoList = new ArrayList<>();
		getConn();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			// rs.next();
			while (rs.next()) {
				int s_rn = rs.getInt(1);
				String s_id = rs.getString(2); // getString() 메소드의 매개변수눈 index도 가능, 컬럼명도 가능
				int s_scr = rs.getInt(3);
				mdto = new BBDTO(s_rn, s_id, s_scr);
				dtoList.add(mdto);
				// System.out.println(s_id + "/" + s_pw + "/" + s_name + "/" + s_age + "/" );
			} // while
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();

		}
		return dtoList;
	}// selectAllMember

	/*---------------------------------3랭킹메소드 끝------------------------------*/
	
	/*---------------------------------3삭제 시작------------------------------*/

	public int deleteMember(String id) {
		String sql = "DELETE FROM MEMBER_INFO_BB WHERE ID = ?";
		getConn();
		int row = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return row;
	}// deleteMember
	/*---------------------------------3삭제 끝------------------------------*/
	/*---------------------------------4누적 랭킹 시작------------------------------*/
	public BBDTO score(String id, int ran) {
		getConn();
		String sql = "UPDATE MEMBER_INFO_BB SET SCORE = SCORE + ? WHERE ID = ?";
//	    String sql3 = "SELECT ROWNUM AS RANKING, ID, SCORE FROM ( SELECT ID, SCORE FROM MEMBER_INFO_BB ORDER BY SCORE DESC) WHERE ROWNUM <=10";        
	    int row = 0;
	    BBDTO mdto = null;
	    try {
	        // Update 쿼리 실행
	        psmt = conn.prepareStatement(sql);
	        psmt.setInt(1, ran);
	        psmt.setString(2, id);
	        row = psmt.executeUpdate();    

	        // 순위 쿼리 실행
//	        psmt = conn.prepareStatement(sql3);
//	        ResultSet rs = psmt.executeQuery();
//	        while (rs.next()) {
//	        	
//	            String s_id = rs.getString(1);
//	            int score = rs.getInt(2);
//	            mdto = new BBDTO(s_id, score);
//	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    } finally {
	        getClose();
	    }
	    return mdto;
	}
	
	
	
	/*---------------------------------4누적 랭킹 끝------------------------------*/
	/*---------------------------------4검색 시작------------------------------*/
	public BBDTO selectOne (String id) {
		String sql = "SELECT * FROM MEMBER_INFO_BB WHERE ID = ?";
		getConn();
		BBDTO mdto = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			
			rs = psmt.executeQuery();
			if(rs.next()) {
				String s_id = rs.getString(1);
				
			mdto = new BBDTO(s_id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		} //finally
		return mdto;
	} //selectOne
	/*---------------------------------4검색 끝------------------------------*/
//rs랑 반복문이랑 뭐가 다른지 모르겠음

	public void updateRank(String id, int rank) {
		// TODO Auto-generated method stub
		
	}
}// class
