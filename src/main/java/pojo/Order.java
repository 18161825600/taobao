package pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:28
 * @Description: 订单类
 */
@Data
public class Order {
    private Integer id;
    private Integer userId;
    private Integer goodsId;
    private Integer shopId;
    private Double totalPrice;
    private Date orderTime;
    private Date updateTime;
}
