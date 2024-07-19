package Board0719;

import Board0719.Service.BoardService;
import Board0719.Service.BoardServiceO;

public class BoardExample {

  public static void main(String[] args) {
    BoardService service = new BoardServiceO();
    service.list();
  }

}
