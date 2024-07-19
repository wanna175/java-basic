package Board0719.Service;

import Board0719.common.Dao.BoardDao;
import Board0719.exception.BoardException;
import Board0719.vo.Board;
import java.util.Scanner;

public class BoardService {

  public Scanner sc = null;
  public BoardDao boardDao = null;

  public BoardService() {
    init();
  }

  private void init() {
    sc = new Scanner(System.in);
    boardDao = new BoardDao();
  }

  private void create() {
    Board board = new Board();
    System.out.println("새로운 게시물 입력");
    sc.nextLine();
    System.out.print("제목 : ");
    board.setBtitie(sc.nextLine());
    System.out.println("내용 : ");
    board.setBcontent(sc.nextLine());
    System.out.println("작성자 : ");
    board.setBwriter(sc.nextLine());

    boardDao.createBoard(board);
    printlist();
  }

  private void update(int bno) {
    Board board = new Board();
    System.out.println("수정 내용 입력");
    sc.nextLine();
    System.out.print("제목 : ");
    board.setBtitie(sc.nextLine());
    System.out.println("내용 : ");
    board.setBcontent(sc.nextLine());

    boardDao.updateBoard(bno, board);
  }

  private void del(int bno) {
    boardDao.deleteBoard(bno);
  }

  private void read() {
    System.out.println("게시물 읽기");
    System.out.print("bno : ");
    int bno = sc.nextInt();
    try {
      Board board = boardDao.getBoard(bno);
      System.out.println("#################");
      System.out.println("제목: " + board.getBtitie());
      System.out.println("내용: " + board.getBcontent());
      System.out.println("작성자: " + board.getBwriter());
      System.out.println("##################");
      System.out.println("보조메뉴 1.update 2.del 나머지는 초기화면");
      int sel = sc.nextInt();
      switch(sel) {
        case 1 -> update(bno);
        case 2 -> del(bno);
      }
    } catch (BoardException e) {
      System.err.println(e.getMessage());
      System.err.println(e.getMessage());
      System.err.println(e.getMessage());
    }

    printlist();
  }

  private void clear() {
    boardDao.deleteAllBoard();
    printlist();
  }


  public void mainMenu() {
    boolean _exit = true;
    while (_exit) {
      System.out.println("메인메뉴 : 1. create 2. read 3. clear ");
      System.out.println("다른 키를 누르면 종료됩니다.");
      System.out.print("메뉴선택 : ");
      int s = sc.nextInt();
      switch(s) {
        case 1 -> create();
        case 2 -> read();
        case 3 -> clear();
        default -> _exit = false;
      }
    }
  }

  private void printlist() {
    //데이터베이스에서 가져옴
    System.out.println("게시물 목록");
    System.out.println("====================");
    System.out.println("no  writer   date    title");
    System.out.println("====================");
    for (Board board : boardDao.getBoardlist()) {
      System.out.println(board.getBno() + " " + board.getBwriter() + " " + board.getBdate() + " "
          + board.getBtitie());
    }
    System.out.println("====================");
  }

  public void list() {
    printlist();
    mainMenu();
  }


}
