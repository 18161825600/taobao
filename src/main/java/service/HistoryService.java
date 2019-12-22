package service;

import pojo.History;

import java.util.List;

public interface HistoryService {

    //添加浏览历史
    Integer insertHistory(History history);

    //根据历史记录id删除记录
    Integer deleteHistory(Integer historyId);

    //根据历史记录id查看单条记录
    History selectHistoryByHistoryId(Integer historyId);

    //根据商品id查看有哪些用户看过该商品
    List<History> selectHistoryByGoodsId(Integer goodsId);

    //根据用户id查看该用户看过哪些商品
    List<History> selectHistoryByUserId(Integer userId);
}
