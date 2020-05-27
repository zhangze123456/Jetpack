package com.example.jetpack.score;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.jetpack.R;
import com.example.jetpack.databinding.ScroreActivityBinding;

/**
 * Created by ${张则} on 2020/5/11.
 * E-mail：18627795967@163.com
 * 类描述：
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class ScoreActivity extends AppCompatActivity {

    private MyScoreViewModel myScoreViewModel;
    ScroreActivityBinding binding;

    /**
     * des:横竖屏 切换 数据还是保留了，然后手机按下 h
     * ome再次进入 程序 依旧存在，数据保留，但是back不行
     *
     * @author ze.zhang
     * @time 2020/5/11 15:30
     */


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myScoreViewModel = new ViewModelProvider(this).get(MyScoreViewModel.class);
        binding = DataBindingUtil.setContentView(this, R.layout.scrore_activity);
        binding.setData(myScoreViewModel);
        binding.setLifecycleOwner(this);


    }
}
