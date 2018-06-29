package com.yeshao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Inner {
    private String msgInner;

    public void innerSay(){
        System.out.println(msgInner);
    }

    public String getMsgInner() {
        return msgInner;
    }

    public void setMsgInner(String msgInner) {
        this.msgInner = msgInner;
    }

//    @PostConstruct
    public void preInit(){
        System.out.println("preInit Inner");
    }

//    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy Inner");
    }
}
