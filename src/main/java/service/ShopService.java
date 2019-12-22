package service;

import pojo.Shop;

import java.util.List;

public interface ShopService {

    //添加店铺信息
    Integer insertShop(Shop shop);

    //根据店铺id删除店铺信息
    Integer deleteShop(Integer id);

    //修改店铺信息
    Integer updateShop(Shop shop);

    //根据店铺id查找店铺信息（店铺id是唯一的，所以只能查找出来一个）
    Shop selectShopById(Integer id);

    //根据店铺名称查找店铺信息(相同的店铺名可以有多个，所以用list）
    List<Shop> selectShopByName(String name);

}
