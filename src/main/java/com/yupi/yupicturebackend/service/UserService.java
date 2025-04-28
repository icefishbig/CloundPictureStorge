package com.yupi.yupicturebackend.service;

import cn.hutool.http.server.HttpServerRequest;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yupi.yupicturebackend.model.dto.UserQueryRequest;
import com.yupi.yupicturebackend.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.yupicturebackend.model.vo.LoginUserVO;
import com.yupi.yupicturebackend.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 31051
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-04-27 05:08:06
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @return 新用户 id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword);

    /**
     * 加密Password
     * @param userPassword 密码
     * @return String
     */
    String getEncryptPassword(String userPassword);

    /**
     * 获取当前用户登录
     * @param userAccount 用户名
     * @param userPassWord 密码
     * @param request Request对象 用于保存用户对象到Seesion中
     * @return
     */
    LoginUserVO userLogin(String userAccount, String userPassWord, HttpServletRequest request);

    /**
     * 获取用户脱敏数据
     *
     * @param user user对象
     * @return 脱敏结果VO对象
     */
    LoginUserVO getLoginUserVO(User user);

    /**
     * 获取用户登录信息
     * @param request
     * @return
     */
    LoginUserVO getLoginUser(HttpServletRequest request);
    /**
     * 用户注销登录
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);
    //获取用户VO对象
    UserVO getUserVO(User user);
    //获取用户列表
    List<UserVO> getUserVOList(List<User> userList);
    //获取条件构造器
    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);
}
