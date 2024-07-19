package Board0719;

import Board0719.common.dbop.DBBoard;
import Board0719.vo.Board;
import java.util.Scanner;

public class BoardExample {

  public Scanner sc = null;
  public DBBoard dbBoard = null;

  BoardExample() {
    init();
  }

  private void init() {
    sc = new Scanner(System.in);
    dbBoard = new DBBoard();
  }

  private void create() {
    Board board = new Board();
    System.out.println("새로운 게시물 입력");
    System.out.print("제목 : ");
    board.setBtitie(sc.nextLine());
    System.out.println("내용 : ");
    board.setBcontent(sc.nextLine());
    System.out.println("작성자 : ");
    board.setBwriter(sc.nextLine());

    dbBoard.createBoard(board);
  }

  private void read() {
    System.out.println("게시물 읽기");
    System.out.print("bno : ");
    int bno = sc.nextInt();
    Board board = dbBoard.getBoard(bno);
    System.out.println("#################");
    System.out.println("제목: " + board.getBtitie());
    System.out.println("내용: " + board.getBcontent());
    System.out.println("작성자: " + board.getBwriter());
    System.out.println("##################");
  }

  private void clear() {

  }


  public void mainMenu() {
    System.out.println("메인메뉴 : 1. create 2. read 3. clear ");
    System.out.println("다른 키를 누르면 종료됩니다.");
    System.out.print("메뉴선택 : ");
    int s = sc.nextInt();
    switch(s) {
      case 1 -> create();
      case 2 -> read();
      case 3 -> clear();
    }
  }

  public void list() {
    //데이터베이스에서 가져옴
    System.out.println("게시물 목록");
    System.out.println("====================");
    System.out.println("no  writer   date    title");
    System.out.println("====================");
    for (Board board : dbBoard.getBoardlist()) {
      System.out.println(board.getBno() + " " + board.getBwriter() + " " + board.getBdate() + " "
          + board.getBtitie());
    }
    System.out.println("====================");
    mainMenu();
  }

  public static void main(String[] args) {
    BoardExample be = new BoardExample();
    be.list();
  }

}