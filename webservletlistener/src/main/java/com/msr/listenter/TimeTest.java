package com.msr.listenter;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时器:(任务调度)
 * 	概念
 * 		调用线程执行任务。可安排任务执行一次，或者定期重复执行。
 * 	创建
 * 		new Timer()
 * 	常用方法
 * 		void schedule(TimerTask task, Date firstTime, long period) :指定一个开始时间,间隔指定时间再次执行任务
 * 		void schedule(TimerTask task, long delay, long period): 延迟一段时间,间隔指定时间再次执行任务
 */
public class TimeTest {
    public static void main(String[] args) {
        //new Timer() 定时器
        //schedule メソッドのサマリー
        //指定したタスクが、指定した時間に開始され、固定遅延実行を繰り返すようにスケジュールします。
        Timer timer = new Timer();
        System.out.println("指定したタスクが:3秒後に開始され、固定4秒の遅延実行を繰り返す");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        },3000,4000);

    }


}
