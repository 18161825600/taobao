package pojo;

import lombok.Data;

/**
 * @Auther: szp
 * @Date: 2019/12/21 21:34
 * @Description: 物流类
 */
@Data
public class Logistics {

    private Integer id;
    private Integer goodsId;
    private Integer userId;
    /**
     * 收货地址id
     */
    private Integer receivingAddressId;
    /**
     * 快递当前状态
     * 0 未发货
     * 1 已发货未接收
     * 2 已接收
     */
    private Short currentState;
    /**
     * 快递当前的地址
     */
    private String currentAddress;
}
