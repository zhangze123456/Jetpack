package com.example.jetpack.room;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.jetpack.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ${张则} on 2020/5/13.
 * E-mail：18627795967@163.com
 * 类描述：SQlite的抽象  实体entity 和 dao接口  增刪 改查
 *
 * datadbase數據 抽象  extends RoomDatabase
 * * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class RoomActivity extends AppCompatActivity {

    @BindView(R.id.textView10)
    TextView textView10;
    @BindView(R.id.insert)
    Button insert;
    @BindView(R.id.delete)
    Button delete;
    @BindView(R.id.update)
    Button update;
    @BindView(R.id.clear)
    Button clear;


    private WordDao wordDao;
    private WordDatabase wordDatabase;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_activity);
        ButterKnife.bind(this);
        //获取实例  表明
        wordDatabase= (WordDatabase) Room.databaseBuilder(this, WordDatabase.class,"word_database")
                .allowMainThreadQueries()
                .build();
        wordDao=wordDatabase.getWordDao();


    }


    public  void updateView(){
        List<Word> mList=wordDao.getAllWord();
        String str="";
        for (Word wd:mList){
            str+= wd.getId()+" "+wd.getWord()+" "+wd.getMeaning()+"\n";
            textView10.setText(str);
        }
    }

    @OnClick({R.id.insert, R.id.delete, R.id.update, R.id.clear})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.insert:
                Word word=new Word("您好","hello");
                Word word1=new Word("张三","zhangsan");
                Word word2=new Word("世界","world");
                wordDao.insertWord(word,word1,word2);
                updateView();
                break;
            case R.id.delete:
                Word word4=new Word("您好","hello");
                word4.setId(2);
                wordDao.deleteWord(word4);
                updateView();
                break;
            case R.id.update:
                Word word5=new Word("修改","update");
                word5.setId(7);
                wordDao.updateWord(word5);
                updateView();
                break;
            case R.id.clear:
                wordDao.deleteAllWords();
                updateView();
                break;
        }
    }
}
