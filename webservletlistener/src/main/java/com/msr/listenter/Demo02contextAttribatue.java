package com.msr.listenter;


import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * 监听三个对象的属性的变化
 * 	ServletContextAttributeListener
 * 	ServletRequestAttributeListener
 * 	HttpSessionAttributeListener
 * 	添加，替换，删除
 */
@WebListener()
public class Demo02contextAttribatue implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("属性がサーブレット・コンテキストに追加されることを監視しました");
        System.out.println(event.getName()+":"+event.getValue());
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println("属性がサーブレット・コンテキストから削除されることを監視しました");
        System.out.println(event.getName()+":"+event.getValue());
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println("属性がサーブレット・コンテキストで置換される（値が変化する）と監視しました");
        System.out.println(event.getName()+":"+event.getValue());
    }
}
