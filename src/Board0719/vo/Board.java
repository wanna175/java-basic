package Board0719.vo;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Board {

  private int bno;
  private String btitie;
  private String bcontent;
  private String bwriter;
  private Date bdate;

}
