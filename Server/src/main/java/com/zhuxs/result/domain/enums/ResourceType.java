package com.zhuxs.result.domain.enums;

/**
 * Created by shusesshou on 2017/9/20.
 */
public enum ResourceType {

    WORDCOUNT(0,"wordcount");

    private int type;
    private String desc;

    ResourceType() {
    }

    ResourceType(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return desc;
    }
}
