package com.example.jetpack.Test;

import android.os.Bundle;

import androidx.annotation.Nullable;

import com.example.jetpack.util.PLog;

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
    }

    @Override
    public void ceshi() {
        PLog.i("ze.zhang","子类 实现的测试方法");
    }
}
