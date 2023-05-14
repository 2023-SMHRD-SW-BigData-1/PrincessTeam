package DTO;

public class GameDTO {
	private String id;
	private String pw;
	private int score;

	
	public GameDTO(String id, String pw, int score) {
		super();
		this.id = id;
		this.pw = pw;
		this.score = score;
	}



	






	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
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





	public void setScore(int score) {
		this.score = score;
	}



	
	

	
	

}
