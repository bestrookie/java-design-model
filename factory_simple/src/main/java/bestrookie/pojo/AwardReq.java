package bestrookie.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bestrookie
 * @date 2021/10/27 3:02 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwardReq {
    private Integer id;
    private String userName;
    private Integer type;
}
