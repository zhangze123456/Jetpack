package com.example.jetpack.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * Created by ${张则} on 2020/5/13.
 * E-mail：18627795967@163.com
 * 类描述：抽象类不能被实例化。因为抽象类中方法未具体化,这是一种不完整的类,所以直接实例化也就没有...
 * 修改人：可以創建單利模式
 * 修改时间：
 * TEL：18627795967
 */
//若有多个Entity 就写多个Dao
@Database(entities = Word.class,version =1,exportSchema = false)
public abstract class WordDatabase extends RoomDatabase {
    public abstract WordDao getWordDao();
}
