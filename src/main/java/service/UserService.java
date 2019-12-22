package service;

import pojo.User;

public interface UserService {

    //添加用户信息
    Integer insertUser(User user);

    //根据用户id删除用户信息
    Integer deleteUser(Integer userId);

    //修改用户信息
    Integer updateUser(User user);

    //根据用户id查找用户信息
    User selectUser(Integer userId);

    //登陆
    User loginUser(Integer userId,String password) throws Exception;
}
