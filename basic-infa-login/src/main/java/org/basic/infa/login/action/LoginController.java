package org.basic.infa.login.action;

import org.basic.infa.login.service.ILoginService;
import org.basic.infa.login.vo.LoginResp;
import org.basic.infa.login.vo.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author qiubingyu
 * @date 2021/1/18
 * @name LoginController
 **/
@RestController
public class LoginController {

    final ILoginService loginService;

    public LoginController(ILoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * 登录
     */
    @PostMapping("/login")
    public LoginResp login(@RequestBody @Validated User user){
        loginService.validUser(user);
        return new LoginResp(user.getUsername(),"xxxxxxxxxxxxxx");
    }

    /**
     * 登出
     */
    public void logout(){
    }
}
