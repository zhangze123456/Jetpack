package com.example.jetpack.room;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

/**
 * Created by ${张则} on 2020/5/13.
 * E-mail：18627795967@163.com
 * 类描述：数据访问的路径 增删改查 逻辑 都在这里
 * 修改人：Word ...Words 表示传入多个参数  ,这里的Word需要和 实体Entity对应
 * 修改时间：
 * TEL：18627795967
 */

@Dao  //data assect object
public interface WordDao {
    @Insert
    void insertWord(Word ...Words);

    @Update
    void updateWord(Word...Words);

    @Delete
    void deleteWord(Word...Words);

    @Query("DELETE FROM WORD")
    void deleteAllWords();

    @Query("SELECT * FROM WORD ORDER BY ID DESC")
    List<Word> getAllWord();

}
