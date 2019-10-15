package com.liu.jersey.serviceloader;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 分销中心
 *
 * @author: liuhongshan
 * @email: liuhongshan@sinovatech.com
 * @date:2019/5/12 16:52
 */
public class TestServiceLoader {


    public static void notInTheClassLoader() throws MalformedURLException {
        ClassLoader serviceCL = new URLClassLoader(new URL[]{new URL("file:" + "D:/ahact/HelloService.jar")},
                TestServiceLoader.class.getClassLoader().getParent());

        /* 指定的ClassLoader没有实现类，所以扫描不到META-INF/services/com.test.loader.HelloService */
        ServiceLoader<HelloService> helloServices = ServiceLoader.load(HelloService.class, serviceCL);

        Iterator<HelloService> it = helloServices.iterator();
        while (it.hasNext()) {
            HelloService service = it.next();
            service.sayHello();
        }
    }



    public static void inTheClassLoader() throws MalformedURLException {
        ClassLoader serviceCL = new URLClassLoader(
                new URL[] { new URL("file:" + "D:/ahact/Dog.jar") },
                TestServiceLoader.class.getClassLoader().getParent());

        /* 实现类在指定的ClassLoader，所以可以扫描META-INF/services/com.test.loader.HelloService */
        ServiceLoader<HelloService> helloServices = ServiceLoader.load(HelloService.class, serviceCL);
        System.out.println("00000tttt00");
        Iterator<HelloService> it = helloServices.iterator();
        while (it.hasNext()) {
            HelloService service = it.next();
            System.out.println("000000000000000");
            service.sayHello();
        }
    }


    public static void main(String[] args) throws MalformedURLException {

        TestServiceLoader.notInTheClassLoader();
        TestServiceLoader.inTheClassLoader();
    }

}
