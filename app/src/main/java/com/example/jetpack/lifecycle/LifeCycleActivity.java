package com.example.jetpack.lifecycle;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jetpack.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ${张则} on 2020/5/13.
 * E-mail：18627795967@163.com
 * 类描述：感知生命周期
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class LifeCycleActivity extends AppCompatActivity {

    @BindView(R.id.myChronoment)
    MyChronometer myChronoment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle_activity);
        ButterKnife.bind(this);
        //必须添加 此栏 不然 计时器 不开始  横竖屏切换 数据依然在计时间 没有重置
        getLifecycle().addObserver(myChronoment);

    }
}
