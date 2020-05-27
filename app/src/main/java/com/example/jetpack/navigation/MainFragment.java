package com.example.jetpack.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.jetpack.R;
import com.example.jetpack.databinding.MainFragmentBinding;

/**
 * Created by ${张则} on 2020/5/12.
 * E-mail：18627795967@163.com
 * 类描述：
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class MainFragment extends Fragment {
    MainFragmentBinding binding;
    NavigatinViewModel navigatinViewModel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
          binding= DataBindingUtil.inflate(inflater,R.layout.main_fragment,container,false);
          navigatinViewModel=new ViewModelProvider(getActivity()).get(NavigatinViewModel.class);
          binding.setData(navigatinViewModel);
          binding.setLifecycleOwner(getActivity());
          binding.button.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  NavController navController= Navigation.findNavController(v);
                  Bundle bundle=new Bundle();
                  bundle.putString("name",binding.textView9.getText().toString());
//                  setArguments(bundle);
                  navController.navigate(R.id.action_mainFragment_to_detailFragment,bundle);
              }
          });
          return binding.getRoot();
    }

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//
//    }
}
