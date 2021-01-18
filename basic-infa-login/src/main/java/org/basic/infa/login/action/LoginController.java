package org.basic.infa.login.action;

import org.basic.infa.login.vo.LoginResp;
import org.basic.infa.login.vo.User;
import org.basic.infa.rest.exception.InfoExeception;
import org.basic.infa.rest.exception.InfoExeceptionSelector;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

/**
 * @author qiubingyu
 * @date 2021/1/18
 * @name LoginController
 **/
@RestController
public class LoginController {
    /**
     * 登录
     */
    @PostMapping("/login")
    public LoginResp login(@Validated User user){
        return null;
    }

    /**
     * 登出
     */
    public void logout(){
    }
}
