package com.example.jetpack.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.jetpack.MaiActivity;
import com.example.jetpack.MainActivity;
import com.example.jetpack.R;
import com.example.jetpack.Test.MyTest;
import com.example.jetpack.bottomNavigation.BottomNavigationActivity;
import com.example.jetpack.lifecycle.LifeCycleActivity;
import com.example.jetpack.room.RoomActivity;
import com.example.jetpack.score.ScoreActivity;
import com.example.jetpack.util.EventBusBean;
import com.example.jetpack.util.LiveDataBus;
import com.example.jetpack.util.PLog;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ${张则} on 2020/5/27.
 * E-mail：18627795967@163.com
 * 类描述：
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class JetpackActivity extends Activity {
    @BindView(R.id.tv_score)
    TextView tvScore;
    @BindView(R.id.tv_navigation)
    TextView tvNavigation;
    @BindView(R.id.tv_room)
    TextView tvRoom;
    @BindView(R.id.tv_lifecycle)
    TextView tvLifecycle;
    @BindView(R.id.tv_original)
    TextView tvOriginal;
    Intent intent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jetpack);
        ButterKnife.bind(this);
        LiveDataBus.get().with("ceshi").setValue("上海金桥信息 股份有限公司");
        EventBus.getDefault().postSticky(new EventBusBean("测试 eventbus的横竖屏"));

    }

    @OnClick({R.id.tv_score, R.id.tv_navigation, R.id.tv_room, R.id.tv_lifecycle, R.id.tv_original})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_score:

                intent=new Intent(this, ScoreActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_navigation:
                intent=new Intent(this, BottomNavigationActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_room:
                intent=new Intent(this, RoomActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_lifecycle:
                intent=new Intent(this, LifeCycleActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_original:
//                intent=new Intent(this, MainActivity.class);
                intent=new Intent(this, MyTest.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        EventBus.getDefault().unregister(JetpackActivity.this);
    }
}
