package com.liu.jersey.serviceloader;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ServiceLoader;

/**
 * 分销中心
 *
 * @author: liuhongshan
 * @email: liuhongshan@sinovatech.com
 * @date:2019/5/12 11:36
 */
public class Main {
    /**
     * 1.调用load方法传入class对象
     * 2.获取class对象的全限定名name
     * 3.在当前线程类加载器的类路径下的META-INF/services目录中读取名称为name的文件
     * 4.逐行读取文件中的类全限定名，通过反射创建该类对象并放入providers中
     * @param args
     */
 /*   public static void main(String[] args) {
    ServiceLoader<IMyDriver> myDrivers = ServiceLoader.load(IMyDriver.class);
        for (IMyDriver myDriver : myDrivers) {
        myDriver.getConnection("127.0.0.1");
        }
    }*/





}
