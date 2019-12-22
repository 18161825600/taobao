package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:29
 * @Description: 收藏商品
 */
@Data
public class Collection {
    private Integer id;
    private Integer goodsId;
    private Integer userId;
    private Date createTime;
    private Date updateTime;
}
