package service;

import pojo.MainPushGoods;

public interface MainPushGoodsService {

    //添加主推商品信息
    Integer insertMainPushGoods(MainPushGoods mainPushGoods);

    //根据主推商品id删除主推商品信息
    Integer deleteMainPushGoods(Integer id);

    //根据主推商品id查找商品的信息
    MainPushGoods selectMainPushGoods(Integer id);
}
