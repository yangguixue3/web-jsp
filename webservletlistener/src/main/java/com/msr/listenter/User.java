package com.msr.listenter;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * HttpSessionBindingListener(解绑和绑定)
 * 	绑定:javabean放入了session(HttpSession)
 * 	解绑:javabean从session移除了
 */
public class User implements HttpSessionBindingListener {
    private String name;
    private String age;
    public User() {
    }
    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    /**
     * セッションにjavabeanをばバインドする
     * 绑定:javabean放入了session(HttpSession)
     * @param event
     */
    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("检测到bean对象的绑定 到session");
        event.getName();
        System.out.println(event.getName()+":"+event.getValue());
    }
    /**
     * せっしょんにJavaBeanをバインド解除
     * 解绑:javabean从session移除了
     * @param event
     */
    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        //セッションからJavaBeanをバインド解除
        System.out.println("检测到bean对象从session中解绑 ");
        System.out.println(event.getName()+":"+event.getValue());
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
