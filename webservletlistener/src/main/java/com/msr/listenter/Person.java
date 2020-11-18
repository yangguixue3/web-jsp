package com.msr.listenter;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * 	HttpSessionActivationListener(钝化和活化)
 * 		钝化:session中的javabean,序列化到磁盘上
 * 		活化:javabean从磁盘中又回到了session中
 * 	注意：
 * 		只需要javabean实现接口即可,不需要配置文件,但是需要实现序列化接口
 */
public class Person implements HttpSessionActivationListener, Serializable {
    /**
     * 		钝化:session中的javabean,序列化到磁盘上
     *      本质:将该类的对象从内存中保存到硬盘
     */
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("person 的钝化");
    }
    /**
     * 		活化:javabean从磁盘中又回到了session中
     * 	    本质:将该类的对象从硬盘中读取到内存中
     */
    @Override
    public void sessionDidActivate(HttpSessionEvent se) {
        System.out.println("person 的活化");
    }

    private String name;
    private String age;
    public Person() {
    }
    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
