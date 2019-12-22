package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:31
 * @Description: 主推商品
 */
@Data
public class MainPushGoods {
    private Integer id;
    private Integer goodsId;
    private Date createTime;
    private Date updateTime;
}
