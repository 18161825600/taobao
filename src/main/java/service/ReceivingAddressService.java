package service;

import pojo.ReceivingAddress;

public interface ReceivingAddressService {

    //添加收货地址
    Integer insertReceivingAddress(ReceivingAddress receivingAddress);

    //删除收货地址
    Integer deleteReceivingAddress(Integer id);

    //修改收货地址
    Integer updateReceivingAddress(ReceivingAddress receivingAddress);

    //根据地址id查找收货地址
    ReceivingAddress selectReceivingAddress(Integer id);

}
