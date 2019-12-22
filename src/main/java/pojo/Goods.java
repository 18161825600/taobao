package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:26
 * @Description: 商品类
 */
@Data
public class Goods {
    private Integer id;
    /**
     * 店家id
     */
    private Integer shopId;
    private String name;
    /**
     * 商品描述
     */
    private String describe;
    private Double price;
    private Date createTime;
    private Date updateTime;
}
