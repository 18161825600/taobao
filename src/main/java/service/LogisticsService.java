package service;

import pojo.Logistics;

import java.util.List;

public interface LogisticsService {

    //添加物流信息
    Integer insertLogistics(Logistics logistics);

    //根据物流id删除物流信息
    Integer deleteLogistics(Integer id);

    //更新物流信息
    Integer updateLogistics(Logistics logistics);

    //通过物流id查找单条物流信息
    Logistics selectLogisticsByLogisticsId(Integer logisticsId);

    //通过用户id查找该用户的所有物流信息
    List<Logistics> selectLogisticsByUserId(Integer userId);

    //通过商品id查找该商品的所有物流信息
    List<Logistics> selectLogisticsByGoodsId(Integer goodsId);
}
