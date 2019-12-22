package service;

import pojo.Order;

import java.util.List;

public interface OrderService {

    //添加订单
    Integer insertOrder(Order order);

    //根据订单id删除订单
    Integer deleteOrder(Integer orderId);

    //修改订单信息
    Integer updateOrder(Order order);

    //根据订单id查找单条订单记录
    Order selectOrderByOrderId(Integer orderId);

    //根据用户id查找该用户下了多少订单
    List<Order> selectOrderByUserId(Integer userId);

    //根据商品id查找该商品有哪些用户下单
    List<Order> selectOrderByGoodsId(Integer goodsId);

    //根据店铺id查找该店铺有哪些商品被下单
    List<Order> selectOrderByShopId(Integer shopId);
}
