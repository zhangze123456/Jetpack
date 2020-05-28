package com.example.jetpack.Test;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.jetpack.util.PLog;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by ${张则} on 2020/5/27.
 * E-mail：18627795967@163.com
 * 类描述：
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class MyTest extends test {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         //创建 observable对象  creat emitter发射器 调用 onNext方法
        Observable observable=Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                PLog.i("ze.zhang","rxjava");
                emitter.onNext("ceshi  rxjava");
            }
        });
        observable.subscribe(this);
    }

    @Override
    public void ceshi(Object o) {
        PLog.i("ze.zhang","子类 实现的测试方法"+o);
    }


}
