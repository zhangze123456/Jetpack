package com.example.jetpack.bottomNavigation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.jetpack.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by ${张则} on 2020/5/22.
 * E-mail：18627795967@163.com
 * 类描述：
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class BottomNavigationActivity extends AppCompatActivity {
    @BindView(R.id.textview)
    TextView textview;
    @BindView(R.id.nav_view)
    BottomNavigationView navView;
    //

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottom_navigation);
        ButterKnife.bind(this);
        //控制
        NavController navController= Navigation.findNavController(this ,R.id.fragment);
//        AppBarConfiguration appBarConfiguration=new AppBarConfiguration.Builder(navController.getGraph()).build();
        //底部 导航
        AppBarConfiguration appBarConfiguration=new AppBarConfiguration.Builder(navView.getMenu()).build();
        //绑定
        NavigationUI.setupActionBarWithNavController(this,navController,appBarConfiguration);
        NavigationUI.setupWithNavController(navView,navController);

    }
}
