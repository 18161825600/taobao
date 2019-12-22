package service;

import pojo.Advertisement;

public interface AdvertisementService {

    //添加广告信息
    Integer insertAdvertisement(Advertisement advertisement);

    //根据id删除广告信息
    Integer deleteAdvertisement(Integer id);

    //修改广告信息
    Integer updateAdvertisement(Advertisement advertisement);

    //根据id查找广告信息
    Advertisement selectAdvertisement(Integer id);
}
