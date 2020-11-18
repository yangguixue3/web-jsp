package com.msr.listenter;


import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;


@WebListener()
public class Demo01request implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Demo02でリクエストが破壊されたことを監視した");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Demo02で  リクエストが初期化されたことを監視した");
    }
}
