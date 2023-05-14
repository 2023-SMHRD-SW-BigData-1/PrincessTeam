package DTO;

public class GameDTO {
	private int rn;
	private String id;
	private String pw;
	
	private int TO;
	private int TA;
	private int score;

	
	public GameDTO(int rn, String id, String pw, int tO, int tA, int score) {
		super();
		this.rn = rn;
		this.id = id;
		this.pw = pw;
		TO = tO;
		TA = tA;
		this.score = score;
	}



	




	public int getRn() {
		return rn;
	}




	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
	}


	public int getTO() {
		return TO;
	}


	public int getTA() {
		return TA;
	}


	public int getScore() {
		return score;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public void setTO(int tO) {
		TO = tO;
	}


	public void setTA(int tA) {
		TA = tA;
	}


	public void setScore(int score) {
		this.score = score;
	}



	
	

	
	

}
