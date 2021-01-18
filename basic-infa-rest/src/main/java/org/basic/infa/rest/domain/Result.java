package org.basic.infa.rest.domain;

/**
 * @autor qiubingyu
 * @date 2021/1/18
 * @name GlobalResult
 **/
public class Result<T> {
    int code;
    String msg;
    T t;

}
