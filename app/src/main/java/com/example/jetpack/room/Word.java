package com.example.jetpack.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by ${张则} on 2020/5/13.
 * E-mail：18627795967@163.com
 * 类描述：实体  主键 列信息
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
@Entity
public class Word {
    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @ColumnInfo(name="english_word")
    private String word;

    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    @ColumnInfo(name="chinese_word")
    private String meaning;
}
