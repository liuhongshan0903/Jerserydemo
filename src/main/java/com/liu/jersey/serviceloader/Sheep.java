package com.liu.jersey.serviceloader;

/**
 * 分销中心
 *
 * @author: liuhongshan
 * @email: liuhongshan@sinovatech.com
 * @date:2019/5/12 11:56
 */

public class Sheep implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("bleat bleat bleat...");
    }
}