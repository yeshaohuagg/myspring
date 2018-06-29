package com.yeshao;

public class Child {
    private String msgChild1;
    private String msgChild2;
    private String msgChild3;
    private String msgParent1;
    private String msgParent2;

    public String getMsgChild1() {
        return msgChild1;
    }

    public void setMsgChild1(String msgChild1) {
        this.msgChild1 = msgChild1;
    }

    public String getMsgChild2() {
        return msgChild2;
    }

    public void setMsgChild2(String msgChild2) {
        this.msgChild2 = msgChild2;
    }

    public String getMsgChild3() {
        return msgChild3;
    }

    public void setMsgChild3(String msgChild3) {
        this.msgChild3 = msgChild3;
    }

    public String getMsgParent1() {
        System.out.println(msgParent1);
        return msgParent1;
    }

    public void setMsgParent1(String msgParent1) {
        this.msgParent1 = msgParent1;
    }

    public String getMsgParent2() {
        System.out.println(msgParent2);
        return msgParent2;
    }

    public void setMsgParent2(String msgParent2) {
        this.msgParent2 = msgParent2;
    }
}
