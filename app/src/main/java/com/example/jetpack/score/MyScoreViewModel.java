package com.example.jetpack.score;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by ${张则} on 2020/5/11.
 * E-mail：18627795967@163.com
 * 类描述：
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class MyScoreViewModel extends ViewModel {


    private MutableLiveData<Integer> aTeam;
    private MutableLiveData<Integer> bTeam;

    private int aBack=0,bBack=0;

    public MutableLiveData<Integer> getaTeam() {
        if (aTeam==null){
            aTeam=new MutableLiveData<>();
            aTeam.setValue(0);
        }
        return aTeam;
    }

    public MutableLiveData<Integer> getbTeam() {
        if (bTeam==null){
            bTeam=new MutableLiveData<>();
            bTeam.setValue(0);
        }
        return bTeam;
    }

    public void addaScore(int p){
        aBack=aTeam.getValue();
        bBack=bTeam.getValue();
        aTeam.setValue(aTeam.getValue()+p);
    }


    public void addbScore(int p){
        aBack=aTeam.getValue();
        bBack=bTeam.getValue();
        bTeam.setValue(bTeam.getValue()+p);
    }

//    重置
    public void reset(){
        aTeam.setValue(0);
        bTeam.setValue(0);
    }

    public void undo(){
        aTeam.setValue(aBack);
        bTeam.setValue(bBack);
    }


}
