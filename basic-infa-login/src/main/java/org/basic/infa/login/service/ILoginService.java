package org.basic.infa.login.service;

import org.basic.infa.login.vo.User;

/**
 * @autor qiubingyu
 * @date 2021/1/19
 * @name ILoginService
 *
 *  1 验证用户，用户是否存在
 *
 *  2 验证密码 密码是否合法
 *
 *  3 生成jwt token, 用户和密码验证成功之后生成token
 *
 *
 **/
public interface ILoginService {
    /**
     * 验证用户
     * 1 验证用户，用户是否存在
     * 2 验证密码 密码是否合法
     * @param user
     */
    void validUser(final User user);

    /**
     * 验证token
     * @param token
     */
    void validToken(String token);

}
