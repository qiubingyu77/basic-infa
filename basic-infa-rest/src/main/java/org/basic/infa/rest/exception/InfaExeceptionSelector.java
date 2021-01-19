package org.basic.infa.rest.exception;

/**
 * @author qiubingyu
 * @ClassName Exeception
 * @date 2021/1/18
 **/
public interface InfaExeceptionSelector {
    InfaExeception Connect_Timeout = new InfaExeception(405,"连接超时");
    InfaExeception Read_Timeout = new InfaExeception(406,"读取超时");
    InfaExeception Illegal_Argument = new InfaExeception(400,"参数异常");
    InfaExeception Inner_Server_Error = new InfaExeception(500,"服务内部异常");
    InfaExeception Auth_Error = new InfaExeception(401,"权限异常");

    InfaExeception Sql_Error = new InfaExeception(601,"SQL异常");
    InfaExeception User_Not_Found_Error = new InfaExeception(602,"用户不存在");
    InfaExeception Password_Error = new InfaExeception(603,"密码错误");
}
