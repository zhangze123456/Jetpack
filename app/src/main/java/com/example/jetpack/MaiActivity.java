package com.example.jetpack;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.jetpack.databinding.DataBingdingLayoutBinding;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.example.jetpack.R.layout.data_bingding_layout;

public class MaiActivity extends AppCompatActivity {
/**
 * des:需要在build中配置     dataBinding{
 *           enabled true
 *         }
 *         在布局中 点击小黄色图标 就可以了
 * @author ze.zhang
 * @time 2020/5/10 22:11
 */

    //实例化 viewModel
    public MyViewModel  myViewModel;
    //data_bingding_layout 布局来的 系统给好的
    DataBingdingLayoutBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.data_bingding_layout);
        myViewModel=new ViewModelProvider(this).get(MyViewModel.class);
        binding.setData(myViewModel);
        binding.setLifecycleOwner(this);
//        binding.textView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               myViewModel.addData();
//            }
//        });

//        myViewModel.getLiveData().observe(this, new Observer<Integer>() {
//            @Override
//            public void onChanged(Integer integer) {
//                binding.textView.setText(String.valueOf(integer));
//            }
//        });


    }


}
