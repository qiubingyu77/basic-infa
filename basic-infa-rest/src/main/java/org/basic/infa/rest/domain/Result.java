package org.basic.infa.rest.domain;

import lombok.Builder;
import lombok.Data;

/**
 * @author qiubingyu
 * @date 2021/1/18
 * @name GlobalResult
 **/
@Builder(toBuilder = true)
@Data
public class Result {
    int code;
    String msg;
    Object data;

    public Result() {
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
