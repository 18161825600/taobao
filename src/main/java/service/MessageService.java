package service;

import pojo.Message;

import java.util.List;

public interface MessageService {

    //添加消息
    Integer insertMessage(Message message);

    //根据消息id删除消息
    Integer deleteMessage(Integer messageid);

    //根据消息id查找单条消息
    Message selectMessageByMessageId(Integer messageId);

    //根据用户id查找用户和哪些商家发了消息
    List<Message> selectMessageByUserId(Integer userId);

    //根据商家id查找商家给哪些用户发了消息
    List<Message> selectMessageByShopId(Integer shopId);
}
