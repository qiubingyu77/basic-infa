package org.basic.infa.rest.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiubingyu
 * @date 2021/1/18
 * @name GlobalControllerAdvice
 **/
@ControllerAdvice(basePackages = {"org.basic.infa"},annotations = {RestController.class})
public class GlobalControllerAdvice {

}
