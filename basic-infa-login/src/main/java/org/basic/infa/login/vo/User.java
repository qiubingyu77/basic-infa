package org.basic.infa.login.vo;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

/**
 * @author qiubingyu
 * @ClassName User
 * @date 2021/1/19
 **/
@Data
public class User {
    @NotBlank(message = "用户名不为空")
    String username;
    @NotBlank(message = "密码不为空")
    String password;
}
