package service;

import pojo.Card;

public interface CardService {

    //添加卡券信息
    Integer insertCard(Card card);

    //根据卡券id删除卡券信息
    Integer deleteCardById(Integer id);

    //根据卡券名称删除卡券信息
    Integer deleteCardByName(String name);

    //修改卡券信息
    Integer updateCard(Card card);

    //根据卡券id查找卡券
    Card selectCardByName(Integer id);

    //根据卡券名称查找卡券
    Card selectCardByName(String name);
}
