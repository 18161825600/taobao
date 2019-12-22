package service;

import pojo.Swiper;

public interface SwiperService {

    //添加轮播图
    Integer insertSwiper(Swiper swiper);

    //根据轮播图id删除轮播图
    Integer deleteSwiperById(Integer id);

    //修改轮播图信息
    Integer updateSwiper(Swiper swiper);

    //查找轮播图信息
    Swiper selectSwiper(Integer id);
}
