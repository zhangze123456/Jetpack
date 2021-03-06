package com.example.jetpack.Test;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.jetpack.util.PLog;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Created by ${张则} on 2020/5/27.
 * E-mail：18627795967@163.com
 * 类描述：抽象类 不能被实例化    子类需要实现 父 抽象 类的方法， 然后父类可以直接调用 接口方法
 *
 * 抽象类 可以不用实现接口的方法  父类实现了接口 子类可以不实现   不然子类不实现就报错  子类和父都实现了接口
 *
 * 父类调用接口 ，接口方法，走子类的实现
 *
 *
 * 父类可以调用抽象 方法 然后传参数给子类  子类实现 父类的抽象方法  ，可供父类调用
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public abstract class  test  extends Activity implements Itest, Observer {
//    @Override
////    public void ceshi() {
////        PLog.i("ze.zhang","父 类 实现的 测试");
////    }


        @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            ;

    }

    @Override
    public void onNext(Object o) {
            PLog.i("ze.zhang","test   onNext"+o);
        ceshi(o);

    }

    @Override
    public void onSubscribe(Disposable d) {

    }

    @Override
    public void onError(Throwable e) {

    }

    @Override
    public void onComplete() {

    }
}
