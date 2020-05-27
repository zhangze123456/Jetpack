package com.example.jetpack.navigation;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jetpack.R;

/**
 * Created by ${张则} on 2020/5/12.
 * E-mail：18627795967@163.com
 * 类描述：让组件切换更方便 快捷
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_activity);
    }
}
