package org.basic.infa.rest.config;


import org.basic.infa.rest.domain.Result;
import org.basic.infa.rest.exception.InfaExeception;
import org.basic.infa.rest.exception.InfaExeceptionSelector;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qiubingyu
 * @date 2021/1/18
 * @name GlobalErorrHanlder
 **/
@ControllerAdvice
public class GlobalErrorHandler{

    @ResponseBody
    @ExceptionHandler(value = InfaExeception.class)
    public Result infoExeception(InfaExeception infoExeception){
        return Result.builder()
                .code(infoExeception.getCode())
                .msg(infoExeception.getMsg())
                .build();
    }

    /**
     * 用于from表达提交校验
     * @param bindException
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public Result bindException(BindException bindException){
        return Result.builder()
                .code(InfaExeceptionSelector.Illegal_Argument.getCode())
                .msg(InfaExeceptionSelector.Illegal_Argument.getMsg()+":"+bindException.getBindingResult().getFieldError().getDefaultMessage())
                .build();
    }

    /**
     * body参数验证异常
     * @param methodArgumentNotValidException
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public Result methodArgumentNotValidException(MethodArgumentNotValidException methodArgumentNotValidException){
        return Result.builder()
                .code(InfaExeceptionSelector.Illegal_Argument.getCode())
                .msg(InfaExeceptionSelector.Illegal_Argument.getMsg()+":"+methodArgumentNotValidException.getBindingResult().getFieldError().getDefaultMessage())
                .build();
    }

    @ResponseBody
    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public Result httpMessageNotReadableException(HttpMessageNotReadableException httpMessageNotReadableException){
        return Result.builder()
                .code(InfaExeceptionSelector.Illegal_Argument.getCode())
                .msg(InfaExeceptionSelector.Illegal_Argument.getMsg()+":"+httpMessageNotReadableException.getMessage())
                .build();
    }

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result exception(Exception e){
        return Result.builder()
                .code(InfaExeceptionSelector.Inner_Server_Error.getCode())
                .msg(InfaExeceptionSelector.Inner_Server_Error.getMsg()+":"+e.getMessage())
                .build();
    }
}
