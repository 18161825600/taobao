package service;

import pojo.ShopCardShip;

public interface ShopCardShipService {

    //添加店铺和卡券的关系
    Integer insertShopCardShip(ShopCardShip shopCardShip);

    //根据关系id删除店铺和卡券的关系
    Integer deleteShopCardShip(Integer id);

    //修改店铺和卡券的关系
    Integer updateShopCardShip(ShopCardShip shopCardShip);

    //根据关系id查找店铺和卡券的关系
    ShopCardShip selectShopCardShip(Integer id);
}
