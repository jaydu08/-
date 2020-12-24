package com.pku.miaosha.redis;
//接口
public interface KeyPrefix {

    public int expireSeconds();

    public String getPrefix();

}
