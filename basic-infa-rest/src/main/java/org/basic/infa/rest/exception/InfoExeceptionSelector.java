package org.basic.infa.rest.exception;

/**
 * @author qiubingyu
 * @ClassName Exeception
 * @date 2021/1/18
 **/
public interface InfoExeceptionSelector {
    InfoExeception Connect_Timeout = new InfoExeception(405,"连接超时");
    InfoExeception Read_Timeout = new InfoExeception(406,"读取超时");
    InfoExeception Illegal_Argument = new InfoExeception(401,"参数异常");
}
