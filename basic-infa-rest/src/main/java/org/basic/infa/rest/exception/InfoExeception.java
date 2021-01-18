package org.basic.infa.rest.exception;

import lombok.Data;

/**
 * @author qiubingyu
 * @ClassName InfoExeception
 * @date 2021/1/18
 **/
@Data
public class InfoExeception extends RuntimeException {

    int code;
    String msg;

    public InfoExeception(int code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }
}
