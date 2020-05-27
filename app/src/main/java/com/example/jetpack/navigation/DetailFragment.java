package com.example.jetpack.navigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.jetpack.R;
import com.example.jetpack.databinding.DetailFragmentBinding;

/**
 * Created by ${张则} on 2020/5/12.
 * E-mail：18627795967@163.com
 * 类描述：
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class DetailFragment extends Fragment {
    DetailFragmentBinding binding;
    NavigatinViewModel navigatinViewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.detail_fragment, container, false);
        navigatinViewModel = new ViewModelProvider(this).get(NavigatinViewModel.class);
        binding.setData(navigatinViewModel);
        binding.setLifecycleOwner(this);
        String name = getArguments().getString("name");
        binding.tvName.setText(name + "");
        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //这里的 v不能用 getView()
                NavController controller = Navigation.findNavController(v);
                controller.navigate(R.id.action_detailFragment_to_mainFragment);

            }
        });
        return binding.getRoot();
        //        return inflater.inflate(R.layout.detail_fragment,container,false);
    }

}



