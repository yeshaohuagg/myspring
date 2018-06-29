package com.yeshao;

import org.springframework.beans.factory.annotation.Autowired;

public class Outer {
    private Inner inner;
    @Autowired
    public Outer(Inner inner){
        this.inner = inner;
    }
    public void outerSay(){
        inner.innerSay();
    }

    public Inner getInner() {
        return inner;
    }

    @Autowired
    public void setInner(Inner inner) {
        this.inner = inner;
    }
}
