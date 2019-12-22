package service;

import pojo.Collection;

import java.util.List;

public interface CollectionService {

    //添加收藏商品信息
    Integer insertCollection(Collection collection);

    //删除收藏的商品信息
    Integer deleteCollection(Integer id);

    //根据收藏id查找单个收藏的信息
    Collection selectCollectionByCollectionId(Integer collectionId);

    //根据用户id查找收藏信息
    List<Collection> selectCollectionByUserId(Integer userId);

    //根据商品id查找收藏信息
    List<Collection> selectCollectionByGoodsId(Integer goodsId);
}
