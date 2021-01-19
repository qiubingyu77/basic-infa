package org.basic.infa.login.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.basic.infa.login.service.ILoginService;
import org.basic.infa.login.vo.User;
import org.basic.infa.mysql.domain.TsUser;
import org.basic.infa.mysql.mapper.UserMapper;
import org.basic.infa.rest.exception.InfaExeception;
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
    public TsUser validUser(final User user) throws InfaExeception {
        TsUser tsUser = userMapper.selectOne(new QueryWrapper<TsUser>().eq("username", user.getUsername()));
        //用户不存在
        Optional.ofNullable(tsUser).orElseThrow(() -> InfaExeceptionSelector.User_Not_Found_Error);
        //密码不正确
        Optional.of(tsUser).filter(tu-> tu.getPassword().equals(user.getPassword())).orElseThrow(()->InfaExeceptionSelector.Password_Error);
        return tsUser;
    }

}
