package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:34
 * @Description: 商品浏览历史
 */
@Data
public class History {

    private Integer id;
    private Integer shopId;
    private Integer goodsId;
    /**
     * 浏览日期
     */
    private Date browseTime;

}
