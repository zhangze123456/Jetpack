package com.example.jetpack;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.textView2)
    TextView textView2;
    @BindView(R.id.textView3)
    TextView textView3;

    //实例化 viewModel
    public MyViewModel  myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        myViewModel = new ViewModelProvider(MainActivity.this).get(MyViewModel.class);
        //取值更新
        myViewModel.getLiveData().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                textView.setText(integer + "");
            }
        });

        myViewModel.getLiveData().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {

            }
        });
    }

    @OnClick({R.id.textView2, R.id.textView3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.textView2:
                myViewModel.addLiveData(1);
//                myViewModel.number++;
//                textView.setText(myViewModel.number);
                break;
            case R.id.textView3:
                myViewModel.addLiveData(2);
//                myViewModel.number=+2;
//                textView.setText(myViewModel.number);
                break;
        }
    }
}
