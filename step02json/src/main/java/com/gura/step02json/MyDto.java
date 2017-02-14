package com.gura.step02json;

/**
 * Created by USER on 2017-02-14.
 */

public class MyDto {
    private int num;
    private String name;
    private String addr;
    public MyDto(){};

    public MyDto(int num, String addr, String name) {
        this.num = num;
        this.addr = addr;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
