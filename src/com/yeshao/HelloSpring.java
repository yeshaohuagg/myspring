package com.yeshao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloSpring {
    private String message;
    private static final Log log = LogFactory.getLog(HelloSpring.class);

    public void getMessage() {
        log.info(message);
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init(){
        log.info("前置处理");
    }
    public void destroy(){
        log.info("后置处理");
    }
}
