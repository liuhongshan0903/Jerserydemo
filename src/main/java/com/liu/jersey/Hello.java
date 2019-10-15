package com.liu.jersey;

/**
 * 分销中心
 *
 * @author: liuhongshan
 * @email: liuhongshan@sinovatech.com
 * @date:2019/5/12 9:10
 */

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class Hello {


    //visit url :http://localhost:8080/jersey/rest/hello/test
    @GET
    @Path("test")
    @Produces(MediaType.APPLICATION_XML)
    public User test() {
        User user = new User();
        user.setName("zhangsan");
        user.setPassword("123456789");
        user.setId(12);
        return user;
    }

    @GET
    @Path("test1")
    @Produces(MediaType.APPLICATION_JSON)
    public User test1() {
        User user = new User();
        user.setName("zhangsan");
        user.setPassword("123456789");
        user.setId(13);
        return user;
    }

    @GET
    @Path("test2")
    @Produces(MediaType.TEXT_PLAIN)
    public String test2() {
        return "hello world";
    }
}