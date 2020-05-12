package com.example.jetpack;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;

/**
 * Created by ${张则} on 2020/5/10.
 * E-mail：18627795967@163.com
 * 类描述：
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class MyViewModel extends ViewModel {
    //Caused by: java.lang.IllegalAccessException:

    private SavedStateHandle handle;

    public MutableLiveData<Integer> getLiveData() {

        if(liveData==null){
            liveData=new MutableLiveData<>();
            liveData.setValue(0);
        }
        return liveData;
    }
   //有参数 构造器 不需要添加依赖了
    //implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
    public MyViewModel(SavedStateHandle handle){
       this.handle=handle;
    }

    public void addLiveData(int i) {
        liveData.setValue(liveData.getValue()+i);
    }

    public void addData() {
        liveData.setValue(liveData.getValue()+1);
    }

    public MutableLiveData<Integer> liveData;


}
