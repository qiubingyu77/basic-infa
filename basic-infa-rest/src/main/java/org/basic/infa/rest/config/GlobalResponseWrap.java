package org.basic.infa.rest.config;

import org.basic.infa.rest.domain.Result;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.Type;

/**
 * @author qiubingyu
 * @ClassName GlobalResponseWrap
 * @date 2021/1/18
 **/
@ControllerAdvice(basePackages = {"org.basic.infa"},annotations = {RestController.class})
public class GlobalResponseWrap implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        Type type = returnType.getExecutable().getAnnotatedReturnType().getType();
        return (type != void.class || type != Void.class) && !type.equals(Result.class);
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (MediaType.APPLICATION_JSON.equalsTypeAndSubtype(selectedContentType) || MediaType.APPLICATION_JSON_UTF8.equalsTypeAndSubtype(selectedContentType)){
            return new Result(200,"成功",body);
        }
        return body;
    }
}
