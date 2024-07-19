package Board0719.exception;

public class BoardException extends Exception {

  @Override
  public String getMessage() {
    return "해당게시물은 삭제되거나 없는 게시물 입니다.";
  }
}
