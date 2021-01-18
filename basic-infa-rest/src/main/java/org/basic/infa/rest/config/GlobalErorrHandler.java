package org.basic.infa.rest.config;


import org.basic.infa.rest.domain.Result;
import org.basic.infa.rest.exception.InfoExeception;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qiubingyu
 * @date 2021/1/18
 * @name GlobalErorrHanlder
 **/
@ControllerAdvice
public class GlobalErorrHandler{

    @ResponseBody
    @ExceptionHandler(value = InfoExeception.class)
    public Result handlerInfoException(InfoExeception infoExeception){
        return new Result(infoExeception.getCode(),infoExeception.getMsg());
    }

    @ResponseBody
    @ExceptionHandler(value = BindException.class)
    public Result handlerBindException(BindException bindException){
        return new Result(400,bindException.getBindingResult().getFieldError().getDefaultMessage());
    }

}
