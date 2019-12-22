package service;

import pojo.UserCardShip;

public interface UserCardShipService {

    //添加用户和卡券的关系
    Integer insertUserCardShip(UserCardShip userCardShip);

    //根据关系id删除用户和卡券的关系
    Integer deleteUserCardShip(Integer id);

    //修改用户和卡券的状态
    Integer updateUserCardShip(UserCardShip userCardShip);

    //根据关系id查找用户和卡券的关系
    UserCardShip selectUserCardShip(Integer id);
}
