package View;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

import DAO.BBDAO;
import DAO.GameDAO;
import DTO.BBDTO;
import DTO.GameDTO;
import DTO.playerDTO;

public class TgameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int num = 0; // 5명 선발시 무작위 번호
		int cnt = 0; // 5명까지 선발
		int TARd = 0; // 게임 시작 후 선수 5명 중 무작위 선택
		int TORd = 0; // 투수 5명 중 랜덤
		ArrayList<playerDTO> player = new ArrayList<>();
		ArrayList<playerDTO> TA = new ArrayList<>();
		ArrayList<playerDTO> TO = new ArrayList<>();
		/* 수정 */
		player.add(new playerDTO("*김태경*", 1));
		player.add(new playerDTO("*개복치*", 2));
		player.add(new playerDTO("*잉어킹*", 3));
		player.add(new playerDTO("*고라파덕*", 4));
		player.add(new playerDTO("*토게피*", 5));
		player.add(new playerDTO("피 츄", 6));
		player.add(new playerDTO("아깽이", 7));
		player.add(new playerDTO("박예은", 8));
		player.add(new playerDTO("너구리", 9));
		player.add(new playerDTO("콘 팡", 10));
		player.add(new playerDTO("쏘드라", 11));
		player.add(new playerDTO("팅커벨", 12));
		player.add(new playerDTO("뚱 이", 13));
		player.add(new playerDTO("스펀지밥", 14));
		player.add(new playerDTO("보노보노", 15));
		player.add(new playerDTO("포로리", 16));
		player.add(new playerDTO("멍뭉이", 17));
		player.add(new playerDTO("별가사리", 18));
		player.add(new playerDTO("이상해씨", 19));
		player.add(new playerDTO("탕구리", 20));
		player.add(new playerDTO("아라리", 21));
		player.add(new playerDTO("파이리", 22));
		player.add(new playerDTO("롱스톤", 23));
		player.add(new playerDTO("파오리", 24));
		player.add(new playerDTO("야도란", 25));
		player.add(new playerDTO("모다피", 26));
		player.add(new playerDTO("근육몬", 27));
		player.add(new playerDTO("디그다", 28));
		player.add(new playerDTO("마임맨", 29));
		player.add(new playerDTO("잠만보", 30));
		player.add(new playerDTO("프리져", 31));
		player.add(new playerDTO("썬 더", 32));
		player.add(new playerDTO("이브이", 33));
		player.add(new playerDTO("꼬부기", 34));
		player.add(new playerDTO("내루미", 35));
		player.add(new playerDTO("푸 린", 36));
		player.add(new playerDTO("또가스", 37));
		player.add(new playerDTO("파이어", 38));
		player.add(new playerDTO("피카츄", 39));
		player.add(new playerDTO("로켓단", 40));
		player.add(new playerDTO("나 옹", 41));
		player.add(new playerDTO("아 귀", 42));
		player.add(new playerDTO("짝 귀", 43));
		player.add(new playerDTO("사쿠라", 44));
		player.add(new playerDTO("손오공", 45));
		player.add(new playerDTO("헐 크", 46));
		player.add(new playerDTO("조니뎁", 47));
		player.add(new playerDTO("톰하디", 48));
		player.add(new playerDTO("그레텔", 49));
		player.add(new playerDTO("헨 젤", 50));
		player.add(new playerDTO("뚭뚜루", 51));
		player.add(new playerDTO("에리얼", 52));
		player.add(new playerDTO("신데렐라", 53));
		player.add(new playerDTO("백 설", 54));
		player.add(new playerDTO("별다줄", 55));
		player.add(new playerDTO("머머리", 56));
		player.add(new playerDTO("뽀로로", 57));
		player.add(new playerDTO("스 팸", 58));
		player.add(new playerDTO("강아지", 59));
		player.add(new playerDTO("이두근", 60));
		player.add(new playerDTO("이왜진", 61));
		player.add(new playerDTO("다비드", 62));
		player.add(new playerDTO("냥냥펀치", 63));
		player.add(new playerDTO("이육사", 64));
		player.add(new playerDTO("까 치", 65));
		player.add(new playerDTO("리자몽", 66));
		player.add(new playerDTO("알라딘", 67));
		player.add(new playerDTO("데드풀", 68));
		player.add(new playerDTO("흰둥이", 69));
		player.add(new playerDTO("프린스", 70));
		player.add(new playerDTO("왕뚜껑", 71));
		player.add(new playerDTO("아쿠스타", 72));
		player.add(new playerDTO("이상해풀", 73));
		player.add(new playerDTO("거북왕", 74));
		player.add(new playerDTO("망나뇽", 75));
		player.add(new playerDTO("김다은", 76));
		player.add(new playerDTO("김민준", 77));
		player.add(new playerDTO("김하신", 78));
		player.add(new playerDTO("김호현", 79));
		player.add(new playerDTO("남건일", 80));
		player.add(new playerDTO("박지원", 81));
		player.add(new playerDTO("세일러문", 82));
		player.add(new playerDTO("박희주", 83));
		player.add(new playerDTO("양동하", 84));
		player.add(new playerDTO("이수호", 85));
		player.add(new playerDTO("이 준", 86));
		player.add(new playerDTO("인여진", 87));
		player.add(new playerDTO("장환익", 88));
		player.add(new playerDTO("정병인", 89));
		player.add(new playerDTO("정윤지", 90));
		player.add(new playerDTO("정준옥", 91));
		player.add(new playerDTO("조서연", 92));
		player.add(new playerDTO("조수민", 93));
		player.add(new playerDTO("진학성", 94));
		player.add(new playerDTO("홍경표", 95));
		player.add(new playerDTO("박원호", 96));
		player.add(new playerDTO("임경남", 97));
		player.add(new playerDTO("박충희", 98));
		player.add(new playerDTO("정세연", 99));
		player.add(new playerDTO("본부장", 100));

		// 타자 선발 ㄴ
		while (cnt < 5) {
			for (int i = 0; i < 5; i++) {
				num = rd.nextInt(player.size() - i);
				TA.add(player.get(num));
				player.remove(num);
				cnt++;
			}
		}
		cnt = 0;

		// 투수 선발
		while (cnt < 5) {
			for (int i = 0; i < 5; i++) {
				num = rd.nextInt(player.size() - i);
				TO.add(player.get(num));
				player.remove(num);
				cnt++;
			}
		}
		cnt = 0;

//		타자 확인
//		for (playerVO ta : TA) {
//			System.out.println(ta.getName() + "\t" + ta.getPower() + "\t");
//		}

//		타자로 선발된 선수를 제외하고 남은 선수들 중에 랜덤으로 5명 투수로 선발함

//		투수 확인
//		for (playerVO to : TO) {
//			System.out.println(to.getName() + "\t" + to.getPower());
//		}

		BBDAO dao = new BBDAO();
		GameDAO yedao = new GameDAO();

		System.out.println("'공'주는 야구 공주팀");
		System.out.println("\r\n"
				+ "\r\n"
				+ "$!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!$\r\n"
				+ "!                                                                                                  !\r\n"
				+ "!                        .=@@*                                                                     !\r\n"
				+ "!                        =@@@@#                                                                    !\r\n"
				+ "!                        @@@@@#                                                                    !\r\n"
				+ "!                        @@@@@@@                                                                   !\r\n"
				+ "!                      $#@@@@@~.                                                                   !\r\n"
				+ "!                   =@@@@@@@@@                                                  !@                 !\r\n"
				+ "!               *=#@@@@@@@@@@$                                                  ,@:                !\r\n"
				+ "!             *@@@@@@@@@@@@@@-    @#                                             $*                !\r\n"
				+ "!         ,;!@@@@@@@@@@@@@@;      #*                                             ;@                !\r\n"
				+ "!       -@@@@@@@@@@@@@@@@@@;                                                      @:               !\r\n"
				+ "!      ,@@@@@@@@@@@@@@@@@@@                                                       =*               !\r\n"
				+ "!      =@@@@@@@@@@@@@@@@@@#                                                       ~@               !\r\n"
				+ "!     ;@@@@@@@@@@@@@@@@@@@:                                                        #               !\r\n"
				+ "!     @@@@@@@@@@@@@@@@@@@@:                                                        -$              !\r\n"
				+ "!    #@@@@@@@@@@@@@@@@@@@@@;                                                        $              !\r\n"
				+ "!   =@@@@@@@@@@@@@@@@@@@@@@@#-  ##@@@@                                        *##:  -              !\r\n"
				+ "!   @@@@@@@@@@@@@@@@$~@@@@@@@@@@@@@@@@.                                       @@@@! .=             !\r\n"
				+ "!  =@@@@@@@@@@@@@@@=   ,@@@@;@@@@@@@@-                                       @@@@@@  @             !\r\n"
				+ "! -@@@@@@@@@@@@@@@@*    :@@@! ;@@@@~                                        ~:@@@@=  **.           !\r\n"
				+ "!~@@@@@@@@;:!@@@@@@*     $@@@~ =@@.                                          ;@@@@!  $@@           !\r\n"
				+ "!@@@@@@@*    @@@@@@*     ~!$@@!:                                              @@@@   .@@#=:,       !\r\n"
				+ "!@@@@@@~     ;@@@@@:        ~@@@@.                                            @@@@@@@@@@@@@@-      !\r\n"
				+ "!#@@@@@       @@@@@~         ,@@=                                           :@@@@@@@@@@@@@@@*      !\r\n"
				+ "! -@@@,       $@@@@                                                        #@@@@@@@@@@@@@@@#       !\r\n"
				+ "! ,@@          @@@@                                                        @@@@@@@@@@@@@@@@        !\r\n"
				+ "!              @@@@                                                        -@@@@@@@@@@@@@:         !\r\n"
				+ "!              @@@@;                                                       ,@@@@@@@@@@@.           !\r\n"
				+ "!              #@@@*                                                        @@@@@@@@@@@.           !\r\n"
				+ "!              #@@@*             =#=.                                       @@@@@@@@@@@.           !\r\n"
				+ "!              #@@@*               -#-  !!     -                   !!       .@@@@@@@@@@            !\r\n"
				+ "!              #@@@*             $@:,=.;;;;,~:~:-.@!           *@*,@@       .@@@@@@@@@@            !\r\n"
				+ "!              @@@@=             $@# -:    :,    .@@           $@*,@@       .@@@@@@@@@@            !\r\n"
				+ "!              @@@@@        .    $@@           : .@@,       .  #@*,@@.      .@@@@@@@@@@            !\r\n"
				+ "!              @@@@@       @@.-- $@@   ~#-, * ~@$.@@-     -@=- #@*,@@.       @@@@@@@@@             !\r\n"
				+ "!              @@@@@       @@@@@.$@@  #@.@@:@ :@#.@@@@@  ~@ $@ @@*,@@.       @@@@@@@@@.            !\r\n"
				+ "!              #@@@*       @=-:@.$@@ :@ =@@ @.:@@.@@:$@!-@# @@ @@*,@@,      .@@@@@@@@@@            !\r\n"
				+ "!              $@@@       ,@=:;@ $@@ @= @@@ *@@@@.@!~~@ #@ #@@ @@=,@@,      .@@@@@@@@@@.           !\r\n"
				+ "!              .@@@*      !@@##  $@@:@=#@@@   :@@.@@#@! @@$@@@ $@# @@,      @@@@@@@@@@@.           !\r\n"
				+ "!               @@@@      !@@-   =@@.@@@-@@   :@#.@@@~  @@@:@@.;@@ --       @@@@@@@@@@@$           !\r\n"
				+ "!              ;@@@-      !@@     ~~  ~  ~~   *@$ ~~     ~~ ~~  ~~         ,@@@@@@@@@@@@           !\r\n"
				+ "!               @@@-      !@@                 @@*                          ,@@@@@@@@@@@@           !\r\n"
				+ "!              ~@@$       -@@                =@#                           ,@@@@@*@@@@@@           !\r\n"
				+ "!                          !!                !:                            ,@@@@@-$@@@@@           !\r\n"
				+ "!                                                                          ;@@@@$  @@@@@           !\r\n"
				+ "!                                                                          ;@@@@,  ~@@@@,          !\r\n"
				+ "!                                                                          @@@@~    @@@@-          !\r\n"
				+ "!                                                                          @@@@     ;@@@-          !\r\n"
				+ "!                                                                         ,@@@@     ,@@@@          !\r\n"
				+ "!                                                                         ~@@@,      @@@@-         !\r\n"
				+ "!                                                                         @@@@       .@@@~         !\r\n"
				+ "!                                                                         @@@@       .@@@#         !\r\n"
				+ "!                                                                         @@@@        @@@@         !\r\n"
				+ "!                                                                         @@@.        !@@@,        !\r\n"
				+ "!                                                                         @@@          @@@:        !\r\n"
				+ "!                                                                        !@@#          #@@:        !\r\n"
				+ "!                                                                        =@@=          #@@=        !\r\n"
				+ "!                                                                        ;@@            @@#        !\r\n"
				+ "!                                                                        !@$            =@@        !\r\n"
				+ "!                                                                       ;@@$             @@.       !\r\n"
				+ "!                                                                       =@#.            ~@@.       !\r\n"
				+ "!                                                                                                  !\r\n"
				+ "!                                                                                                  !\r\n"
				+ "$!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!$\r\n"
				+ "");
		

		
		
		dao.create();
	
		
		
		
		System.out.println("=============순위=============");
		System.out.println("순위" + "\t" + "ID" + "\t\t" + "점수");
		System.out.println("=============================");

		ArrayList<BBDTO> dtoList = dao.selectAllMember();
		for (int i = 0; i < dtoList.size(); i++) {
			System.out.println(dtoList.get(i).getRn() + "\t"+ dtoList.get(i).getId() + "\t\t" + dtoList.get(i).getRan());
		}

		System.out.println();

		while (true) {
			System.out.println("[1] 회원가입 [2] 로그인 [3] 게임 종료");
			int input = sc.nextInt();

			if (input == -1) {
				System.out.println("[1]강퇴[2]돌아가기");
				while (true) {
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
						} // else
					} // else
				} // while
			} // if
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
					System.out.println("회원 가입을 축하드립니다 !");
				} else {
					System.out.println("회원가입에 실패했습니다.");
				} // else

			} else if (input == 2) {/*************** 로그인 ****************/
				// 1. 사용자로부터 ID,PW 입력받기
				System.out.print("로그인 ID : ");
				String id = sc.next();
				System.out.print("로그인 PW : ");
				String pw = sc.next();
				BBDTO mdto = dao.login(id, pw);
				if (mdto != null) {
					try {
						System.out.println();
						TimeUnit.SECONDS.sleep(1);
						System.out.println(id + " 님, 레트로 야구 게임의 세계에 오신 것을 환영합니다 !! ");
						System.out.println();

						TimeUnit.SECONDS.sleep(1);

						System.out.println("바로 시작합니다 !");
						System.out.println();

						TimeUnit.SECONDS.sleep(1);

						System.out.println("선수 뽑는 중...");
						System.out.println();

						TimeUnit.SECONDS.sleep(1);
						System.out.println("뽑기 완료 ! 당신의 팀은...");
						System.out.println();

						for (int i = 0; i < 5; i++) {
							if (TA.get(i).getPower() <= 5) {
								TimeUnit.SECONDS.sleep(1);
								System.out.println("!!!!!!!! *히든 선수* 등장 !!!!!!!!");
								break;
							}
						}
						System.out.println();

						TimeUnit.SECONDS.sleep(1);
						System.out.println("   이름 " + " " + "( 능력치 )");
						System.out.println("=================");
						for (int i = 0; i < TA.size(); i++) {
							System.out
									.println(i + 1 + ". " + TA.get(i).getName() + " ( " + TA.get(i).getPower() + " )");
						}
						System.out.println("=================");

						System.out.println();

						TimeUnit.SECONDS.sleep(1);
						System.out.print("게임을 시작할까요? (y/n) : ");

						String userAns = sc.next();

						System.out.println();

						if (userAns.equals("y") || userAns.equals("Y") || userAns.equals("ㅛ")) {
						} else if (userAns.equals("n") || userAns.equals("N") || userAns.equals("ㅜ")) {
							System.out.println("거절은 거절합니다");
						} else {
							System.out.println("당신은 내 말을 전혀 듣지 않고 있군요...");
						}

						TimeUnit.SECONDS.sleep(1);
						System.out.println("< 게임을 시작합니다 >");

						int score = 0;
						int lose = 0;
						int num1 = 1;
						int st = 0;
						int G = 0;
						int sum = 0;
						int powerUp = 1;
						int speedUp = 2;
						int concenUp = 3;

						while (true) {
							if (score < 10) {

								TimeUnit.SECONDS.sleep(1);

								System.out.println();

								System.out.println(num1++ + "번째 게임입니다 !");

								System.out.println();

								TARd = rd.nextInt(5);
								TORd = rd.nextInt(5);

								TimeUnit.SECONDS.sleep(1);
								System.out.println("상대 투수는 < " + TO.get(TORd).getName() + " > 입니다");

								TimeUnit.MILLISECONDS.sleep(500);
								if (TO.get(TORd).getPower() >= 80) {
									int menRd = rd.nextInt(3);
									if (menRd == 0) {
										System.out.println(" * 상당히 강한 선수들 중에 한명입니다");
									} else if (menRd == 1) {
										System.out.println(" * 이 선수 오늘 컨디션이 상당히 좋아보입니다");
									} else if (menRd == 2) {
										System.out.println(" * 자신감이 넘치는 모습입니다");
									}
								} else if (TO.get(TORd).getPower() <= 20) {
									int menRd = rd.nextInt(3);
									if (menRd == 0) {
										System.out.println(" * 기대에 못미치는 플레이를 선보이는 선수입니다");
									} else if (menRd == 1) {
										System.out.println(" * 어딘가 지쳐보이는 건 기분 탓일까요");
									} else if (menRd == 2) {
										System.out.println(" * 오늘 컨디션이 좋아보이지는 않습니다...");
									}
								}

								System.out.println();

								TimeUnit.SECONDS.sleep(1);
								System.out.print("이에 맞서는 타자는 ");
								TimeUnit.MILLISECONDS.sleep(200);
								System.out.print(".");
								TimeUnit.MILLISECONDS.sleep(200);
								System.out.print(".");
								TimeUnit.MILLISECONDS.sleep(200);
								System.out.print(".");
								TimeUnit.MILLISECONDS.sleep(200);
								System.out.println(" < " + TA.get(TARd).getName() + " > 선수 !");

								if (TA.get(TARd).getPower() >= 80) {
									int menRd = rd.nextInt(3);
									if (menRd == 0) {
										System.out.println(" * 배트에 힘이 잔뜩 들어가 있습니다");
									} else if (menRd == 1) {
										System.out.println(" * 한창 상승세를 타고 있는 선수입니다");
									} else if (menRd == 2) {
										System.out.println(" * 기대되는 선수입니다");
									}
								} else if (TA.get(TARd).getPower() <= 20) {
									int menRd = rd.nextInt(3);
									if (menRd == 0) {
										System.out.println(" * 기대에 못미치는 플레이를 선보이는 선수입니다");
									} else if (menRd == 1) {
										System.out.println(" * 어딘가 지쳐보이는 건 기분 탓일까요");
									} else if (menRd == 2) {
										System.out.println(" * 오늘 컨디션이 좋아보이지는 않습니다...");
									}
								}
								System.out.println();

								TimeUnit.SECONDS.sleep(1);

								System.out.println("1. 계속 진행    2. 인벤토리 열기 (타자 능력치) ");

								int userAns3 = sc.nextInt();

								while (true) {
									if (userAns3 == 1) {
										break;
									} else if (userAns3 == 2) {
										System.out.println("1. 파워포션 : (" + powerUp + "/1)" + " 2. 속도포션 : (" + speedUp
												+ "/2)" + " 3. 집중력포션 : (" + concenUp + "/3)");

										int userAns4 = sc.nextInt();

										if (userAns4 == 1 && powerUp != 0) {
											System.out.println("파워포션을 사용합니다. 온 몸에 힘이 넘칩니다.");
											powerUp--;
											TA.get(TARd).setPower(TA.get(TARd).getPower() + 80);
											break;
										} else if (userAns4 == 2 && speedUp != 0) {
											System.out.println("속도포션을 사용합니다. 몸이 가벼워집니다.");
											speedUp--;
											TA.get(TARd).setPower(+50);
											break;
										} else if (userAns4 == 3 && concenUp != 0) {
											System.out.println("집중력포션을 사용합니다. 시간이 느려진 것 같습니다.");
											TA.get(TARd).setPower(+30);
											concenUp--;
											break;
										} else {
											System.out.println("잘못 입력하셨습니다. 다시 선택하세요.");
										}

									}
								}

								TimeUnit.SECONDS.sleep(1);
								System.out.println("투수 와인드 - 업");
								TimeUnit.SECONDS.sleep(1);
								System.out.println();

								int taAbil = TA.get(TARd).getPower();
								int toAbil = TO.get(TORd).getPower();

								if (taAbil > toAbil) {
									if (taAbil - toAbil >= 70) {
										TimeUnit.MILLISECONDS.sleep(100);
										System.out.print(" !!");
										TimeUnit.MILLISECONDS.sleep(100);
										System.out.print("!!");
										TimeUnit.MILLISECONDS.sleep(100);
										System.out.print("!!");
										TimeUnit.MILLISECONDS.sleep(100);
										System.out.println("!!");
										TimeUnit.MILLISECONDS.sleep(1000);
										int menRd = rd.nextInt(3);
										if (menRd == 0) {
											System.out.println("멀리 뻗어 펜스 넘어갑니다 !! ");
											TimeUnit.MILLISECONDS.sleep(1000);
											System.out.println(" <<< 홈런 !! >>> + 3점 획득합니다!!");
										} else if (menRd == 1) {
											System.out.println(" 쳤습니다 !!! ");
											TimeUnit.MILLISECONDS.sleep(1000);
											System.out.println(" <<< 홈런 !! >>> + 3점 획득합니다!!");
										} else if (menRd == 2) {
											System.out.println(" 쭉쭉 뻗어나갑니다 ! ");
											TimeUnit.MILLISECONDS.sleep(1000);
											System.out.println(" <<< 홈런 !! >>> + 3점 획득합니다!!");
										}
										score = score + 3;
										TimeUnit.MILLISECONDS.sleep(1000);

									} else if (taAbil - toAbil <= 70 && taAbil - toAbil > 30) {

										TimeUnit.MILLISECONDS.sleep(1000);
										System.out.println("쳤습니다 !! 안타 ! + 1점 !");
										score = score + 1;
										TimeUnit.MILLISECONDS.sleep(1000);

									} else if (taAbil - toAbil <= 30) {

										TimeUnit.MILLISECONDS.sleep(1000);
										System.out.println("스트라이크!!");
										st++;
										TimeUnit.MILLISECONDS.sleep(1000);

										if (st >= 3) {

											System.out.println();
											TimeUnit.MILLISECONDS.sleep(1000);
											System.out.println("투수의 공이 스트라이크 존으로 들어오면서 아웃입니다 !! 게임 종료 !");
											TimeUnit.MILLISECONDS.sleep(1000);
											System.out.println();
											System.out.println("누적점수 : " + score);
											System.out.println("=======================");
											System.out.println();

											break;
										}

									}
									System.out.println();
									System.out.println("누적점수 : " + score + " 스트라이크 : " + st);
									System.out.println();
									System.out.println("=======================");

								} else if (toAbil > taAbil) {
									if (toAbil - taAbil >= 70) {
										System.out.println();
										TimeUnit.MILLISECONDS.sleep(1000);
										System.out.println("스트라이크!!");
										st++;
										System.out.println();
										TimeUnit.MILLISECONDS.sleep(1000);

										if (st >= 3) {

											System.out.println();
											TimeUnit.MILLISECONDS.sleep(1000);
											System.out.println("투수의 공이 스트라이크 존으로 들어오면서 아웃입니다 !! 게임 종료 !");
											System.out.println();
											TimeUnit.MILLISECONDS.sleep(1000);
											System.out.println("누적점수 : " + score);
											System.out.println();
											System.out.println("=======================");
											System.out.println();
											break;
										}
									} else if (toAbil - taAbil <= 70 && toAbil - taAbil > 30) {

										System.out.println();
										TimeUnit.MILLISECONDS.sleep(1000);
										System.out.println("쳤습니다 !! 안타 ! + 1점 !");
										score = score + 1;
										System.out.println();
										TimeUnit.MILLISECONDS.sleep(1000);

									} else if (toAbil - taAbil <= 30) {

										TimeUnit.MILLISECONDS.sleep(100);
										System.out.print(" !!");
										TimeUnit.MILLISECONDS.sleep(100);
										System.out.print("!!");
										TimeUnit.MILLISECONDS.sleep(100);
										System.out.print("!!");
										TimeUnit.MILLISECONDS.sleep(100);
										System.out.println("!!");
										TimeUnit.MILLISECONDS.sleep(1000);

										int menRd = rd.nextInt(3);
										if (menRd == 0) {
											System.out.println("멀리 뻗어 펜스 넘어갑니다 !! ");
											TimeUnit.MILLISECONDS.sleep(1000);
											System.out.println(" <<< 홈런 !! >>> + 3점 획득합니다!!");
										} else if (menRd == 1) {
											System.out.println(" 쳤습니다 !!! ");
											TimeUnit.MILLISECONDS.sleep(1000);
											System.out.println(" <<< 홈런 !! >>> + 3점 획득합니다!!");
										} else if (menRd == 2) {
											System.out.println(" 쭉쭉 뻗어나갑니다 ! ");
											TimeUnit.MILLISECONDS.sleep(1000);
											System.out.println(" <<< 홈런 !! >>> + 3점 획득합니다!!");
										}
										score = score + 3;
										TimeUnit.MILLISECONDS.sleep(1000);

									}

									System.out.println();
									System.out.println("누적점수 : " + score + " 스트라이크 : " + st);
									System.out.println();
									System.out.println("=======================");
								}

							} else if (score >= 10) {

								if (score >= 10) {

									System.out.println("종료");
									System.out.println();
									System.out.println("누적점수 : " + score);
									System.out.println();
									System.out.println("=======================");
									System.out.println();

									break;

								}
							}
						}

						sum += score;
						mdto = dao.score(id, sum);

					} catch (Exception e) {
						System.out.println(e);
					}

				} else {
					System.out.println("로그인 실패, 다시 시도하세요.");
				}
			} else if (input == 3) {/*************** 검색 ****************/
				System.out.println("프로그램을 종료합니다.");
				break;
			} // else
		} // while

	}
}