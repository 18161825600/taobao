package service;

import pojo.Goods;

import java.util.List;

public interface GoodsService {

    //添加商品信息
    Integer insertGoods(Goods goods);

    //根据商品id删除商品信息
    Integer deleteGoods(Integer id);

    //修改商品信息
    Integer updateGoods(Goods goods);

    //根据商品id查找商品信息（商品id是唯一的）
    Goods selectGoodsById(Integer id);

    //根据商品名称查找商品信息（相同商品名字可以有多个）
    List<Goods> selectGoodsByName(String name);
}
