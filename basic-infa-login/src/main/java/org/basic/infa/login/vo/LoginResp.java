package org.basic.infa.login.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qiubingyu
 * @ClassName LoginResp
 * @date 2021/1/18
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResp {
    String username;
    String token;
}
