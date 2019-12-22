package service;

import pojo.Cart;

import java.util.List;

public interface CartService {

    //添加购物车信息
    Integer insertCart(Cart cart);

    //根据购物车id删除购物车信息
    Integer deleteCart(Integer id);

    //修改购物车信息
    Integer updateCart(Cart cart);

    //根据购物车id查找用户和商品的关系
    Cart selectCartByCartId(Integer cartId);

    //根据用户id查找购物车信息（查看这个用户的购物车里有什么商品）
    List<Cart> selectCartByUserId(Integer userId);

    //根据商品id查找购物车信息（查看这个商品被多少用户加入到购物车里）
    List<Cart> selectCartByGoodsId(Integer goodsId);
}
