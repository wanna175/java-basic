package Board0719.common.dbop;

import Board0719.common.factory.ConnectionFactory;
import Board0719.vo.Board;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DBBoard {

  private Connection connection = null;
  private ResultSet rs = null;
  private ArrayList<Board> boardList = null;
  private int nextbno;

  public DBBoard() {
    boardList = new ArrayList<>();
    updateBoardlist();
    nextbno = boardList.get(boardList.size() - 1).getBno() + 1;
  }

  public ArrayList<Board> getBoardlist() {
    return boardList;
  }

  public Board getBoard(int bno) {
    return selectBoard(bno);
  }

  public boolean createBoard(Board board) {
    String query = "INSERT INTO board(bno,writer,title,content,date) VALUES(?,?,?,?,?)";
    connection = ConnectionFactory.getInstance().open();
    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setInt(1, nextbno);
      pstmt.setString(2, board.getBwriter());
      pstmt.setString(3, board.getBtitie());
      pstmt.setString(4, board.getBcontent());
      pstmt.setDate(5, new Date(System.currentTimeMillis()));

      pstmt.executeUpdate();

      pstmt.close();
    } catch (SQLException e) {
      System.err.println("에러 : " + e.getMessage());
      return false;
    } finally {
      ConnectionFactory.getInstance().close();
    }
    updateBoardlist();
    return true;
  }

  private void updateBoardlist() {
    boardList.clear();
    String query = "SELECT * FROM board";
    connection = ConnectionFactory.getInstance().open();

    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      rs = pstmt.executeQuery();
      while (rs.next()) {
        Board board = new Board();
        board.setBno(rs.getInt("bno"));
        board.setBtitie(rs.getString("title"));
        board.setBcontent(rs.getString("content"));
        board.setBwriter(rs.getString("writer"));
        board.setBdate(rs.getDate("date"));
        boardList.add(board);
      }
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      System.err.println("Error : " + e.getMessage());
    } finally {
      ConnectionFactory.getInstance().close();
    }
  }

  private Board selectBoard(int bno) {
    String query = "SELECT bno,title,content,writer,date"
        + "FROM board " + "WHERE bno = ?";
    connection = ConnectionFactory.getInstance().open();
    Board board = new Board();
    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setInt(1, bno);
      rs = pstmt.executeQuery();
      if (rs.next()) {
        board.setBno(rs.getInt("bno"));
        board.setBtitie(rs.getString("title"));
        board.setBcontent(rs.getString("content"));
        board.setBwriter(rs.getString("writer"));
        board.setBdate(rs.getDate("date"));
      } else {
        System.out.println("해당 게시물은 없거나 삭제되었습니다.");
      }
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      System.err.println("Error : " + e.getMessage());
    } finally {
      ConnectionFactory.getInstance().close();
    }
    return board;
  }

  public boolean deleteAllBoard() {
    String query = "DELETE FROM board";
    connection = ConnectionFactory.getInstance().open();
    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.executeUpdate();
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      System.err.println("Error : " + e.getMessage());
      return false;
    } finally {
      ConnectionFactory.getInstance().close();
    }
    boardList.clear();
    nextbno = 1;
    return true;
  }

  public boolean deleteBoard(int bno) {
    String query = "DELETE FROM " + "board WHERE bno = " + String.valueOf(bno);
    connection = ConnectionFactory.getInstance().open();
    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.executeUpdate();
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      System.err.println("Error : " + e.getMessage());
      return false;
    } finally {
      ConnectionFactory.getInstance().close();
    }
    updateBoardlist();
    nextbno = boardList.get(boardList.size() - 1).getBno() + 1;
    return true;
  }

  public boolean updateBoard(int bno, Board updateBoard) {
    String query = "UPDATE board SET "
        + "title = ?, "
        + "content = ? "
        + "WHERE bno = " + String.valueOf(bno);
    connection = ConnectionFactory.getInstance().open();
    try {
      PreparedStatement pstmt = connection.prepareStatement(query);
      pstmt.setString(1, updateBoard.getBtitie());
      pstmt.setString(2, updateBoard.getBcontent());
      pstmt.executeUpdate();
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      System.err.println("Error : " + e.getMessage());
      return false;
    } finally {
      ConnectionFactory.getInstance().close();
    }
    updateBoardlist();
    nextbno = boardList.get(boardList.size() - 1).getBno() + 1;
    return true;
  }
}
