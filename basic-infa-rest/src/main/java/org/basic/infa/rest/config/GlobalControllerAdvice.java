package org.basic.infa.rest.config;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @autor qiubingyu
 * @date 2021/1/18
 * @name GlobalControllerAdvice
 **/
@ControllerAdvice(basePackages = {"org.basic.infa"},annotations = {RestController.class})
public class GlobalControllerAdvice implements ResponseBodyAdvice {


    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {

        return false;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        return null;
    }


    
}
