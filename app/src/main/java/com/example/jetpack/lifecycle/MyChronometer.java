package com.example.jetpack.lifecycle;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.Chronometer;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * Created by ${张则} on 2020/5/13.
 * E-mail：18627795967@163.com
 * 类描述：
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public  class MyChronometer  extends Chronometer implements LifecycleObserver {
   /**
    *
    * 横竖屏  activity重建的时候
    * des:这里简便起见，使用了 Static 但这不是一个好办法，若Mychronometery有多个实例，这些实例将共享elapsedTime变量
    * 从而无法各自计算 最好 采用 viewmodel或者SaveInstantSaveState中
    */
    private long elapsedTime;
    public MyChronometer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    //需要自己手动 添加出来
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void pauseMeter(){

        elapsedTime= SystemClock.elapsedRealtime()-getBase();

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void resumeMeter(){
        setBase(SystemClock.elapsedRealtime()-elapsedTime);
        start();

    }
}
