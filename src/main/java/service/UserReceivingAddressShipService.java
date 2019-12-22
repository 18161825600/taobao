package service;

import pojo.UserReceivingAddressShip;

public interface UserReceivingAddressShipService {

    //添加收货人和地址的关系
    Integer insertReceivingAddressShip(UserReceivingAddressShip userReceivingAddressShip);

    //根据收货人id删除关系
    Integer deleteReceivingAddressShipByUserId(Integer userId);

    //根据收货地址id删除关系
    Integer deleteReceivingAddressShipByReceivingAddressId(Integer ReceivingAddressId);

    //修改收货地址关系
    Integer updateReceivingAddressShip(UserReceivingAddressShip userReceivingAddressShip);

    //查找收货地址关系(只能查找自己的收货地址，所以不能用地址id查找）
    UserReceivingAddressShip selectReceivingAddressShip(Integer userId);

}
