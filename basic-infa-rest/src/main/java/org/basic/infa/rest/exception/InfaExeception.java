package org.basic.infa.rest.exception;

import lombok.Data;

/**
 * @author qiubingyu
 * @ClassName InfoExeception
 * @date 2021/1/18
 **/
@Data
public class InfaExeception extends RuntimeException {

    int code;
    String msg;

    public InfaExeception(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
