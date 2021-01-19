package org.basic.infa.login.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.basic.infa.login.service.ILoginService;
import org.basic.infa.login.vo.User;
import org.basic.infa.mysql.domain.TsUser;
import org.basic.infa.mysql.mapper.UserMapper;
import org.basic.infa.rest.exception.InfaExeceptionSelector;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * @autor qiubingyu
 * @date 2021/1/19
 * @name LoginService
 **/
@Component
public class LoginService implements ILoginService {

    final UserMapper userMapper;

    public LoginService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public void validUser(final User user) {
        TsUser tsUser = userMapper.selectOne(new QueryWrapper<TsUser>().eq("username", user.getUsername()));
        tsUser = Optional.ofNullable(tsUser).orElseThrow(() -> InfaExeceptionSelector.User_Not_Found_Error);
        if (!tsUser.getPassword().equals(user.getPassword())){
            throw InfaExeceptionSelector.Password_Error;
        }
    }

    @Override
    public void validToken(String token) {

    }
}
