package com.example.jetpack.util;

import androidx.lifecycle.MutableLiveData;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ${张则} on 2020/5/28.
 * E-mail：18627795967@163.com
 * 类描述：避免内存泄漏   不需要解决生命周期带来的问题  解决Configuration Change问题
 * LiveData采用观察者模式，数据发生时获得通知，更新UI
 * Des：基于LiveData的事件总线，更加便捷高效，替代EventBus
 *  优点：
 * 无需引入依赖，使用官方提供的LiveData类
 * 自动感应组件的生命周期，无内存泄漏风险
 * 代码量少，能完全替代EventBus
 *LiveDataBus  在注册接受前发送的 消息仍然可接收到
 *
 *
 * Eventbus 绑定和 解注册 都在 接收方 ，若是没收到可以 使用 粘性发送
 * 修改人：
 * 修改时间：
 * TEL：18627795967p
 */
public class LiveDataBus {

    private Map<String, MutableLiveData<Object>> bus;

    private LiveDataBus(){
        if (bus==null){
            bus=new HashMap<>();
        }
    }

    public static LiveDataBus get(){
        return  LiveDataBusHolder.DEFAULT_BUS;
    }

    public synchronized <T> MutableLiveData<T> with(String key,Class<T> type){
        if (!bus.containsKey(key)){
            bus.put(key,new MutableLiveData<Object>());
        }
        return (MutableLiveData<T>)bus.get(key);
    }

    public  MutableLiveData<Object> with(String key){
        return with(key,Object.class);
    }


    private static class LiveDataBusHolder{
        private static final LiveDataBus DEFAULT_BUS = new LiveDataBus();
    }
}