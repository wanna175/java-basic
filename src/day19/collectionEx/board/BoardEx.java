package day19.collectionEx.board;

import java.util.ArrayList;
import java.util.List;

public class BoardEx {

  public static void main(String[] args) {
    List<Board> boardList = new ArrayList<>();

    boardList.add(new Board("맛있는 점심1 ", "서유미1", "내일은 뭐 먹지?1"));
    boardList.add(new Board("맛있는 점심2", "서유미2", "내일은 뭐 먹지?2"));
    boardList.add(new Board("맛있는 점심3", "서유미3", "내일은 뭐 먹지?3"));
    boardList.add(new Board("맛있는 점심4", "서유미4", "내일은 뭐 먹지?4"));
    boardList.add(new Board("맛있는 점심5", "서유미5", "내일은 뭐 먹지?5"));

    int boardSize = boardList.size();
    System.out.println(boardSize);

    Board board = boardList.get(2);
    System.out.println(board.getSubject() + "\t" + board.getWriter() + "\t" + board.getContent());
    System.out.println("=====================================");

    //boardList의 모든 게시글을 다 출력해 보자 1. 인덱스 이용하기
    for (int i = 0; i < boardList.size(); i++) {
      Board board1 = boardList.get(i);
      System.out.println(
          board1.getSubject() + "\t" + board1.getWriter() + "\t" + board1.getContent());

    }
    System.out.println("=====================================");

    //2. 향상된 for를 이용하여 모든 객체 출력하기
    for (Board b : boardList) {
      System.out.println(b.getSubject() + "\t" + b.getWriter() + "\t" + b.getContent());
    }
  }

}
