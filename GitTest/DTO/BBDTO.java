package DTO;

public class BBDTO {

//	1. 필드
//	ID
	private String id;
//	PW
	private String pw;
//	age
	private int ran;
	
//	2. 생성자, 메소드
	
	

	public BBDTO(String id, String pw, int ran) {
		super();
		this.id = id;
		this.pw = pw;
		this.ran = ran;
	}
	public BBDTO(String id) {
		super();
		this.id = id;
	}
	public BBDTO(int ran) {
		super();
		this.ran = ran;
	}
	public BBDTO(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public BBDTO(String id, int ran) {
		super();
		this.id = id;
		this.ran = ran;
	}
	
	
	/**********************get,set******************/
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public int getRan() {
		return ran;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public void setRan(int ran) {
		this.ran = ran;
	}
	

}
