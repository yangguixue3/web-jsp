package com.msr.listenter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * イベント・リスナー ServletContextListener ServletRequestListener HttpSessionListener
 *
 * このインタフェースは、サーブレット・コンテキストのライフ・サイクル・イベントを追跡するために使用するクラスに実装します
 */

public class Demo01context implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Demo01で サーブレット・コンテナの初期化を監視されました");
        System.out.println("name"+sce.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Demo01で サーブレット・コンテナの停止を監視されました");
    }
}
