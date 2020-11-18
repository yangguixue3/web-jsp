package com.msr.listenter;


import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener()
public class Demo01session implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("Demo02でセッションが破壊されたことを監視した");

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Demo02でセッションが破壊されたことを監視した");

    }
}
