package org.basic.infa.rest.domain;

import lombok.Data;

/**
 * @autor qiubingyu
 * @date 2021/1/18
 * @name GlobalResult
 **/
@Data
public class Result {
    int code;
    String msg;
    Object data;

}
