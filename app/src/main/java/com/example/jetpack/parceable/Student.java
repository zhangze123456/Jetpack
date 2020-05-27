package com.example.jetpack.parceable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ${张则} on 2020/5/17.
 * E-mail：18627795967@163.com
 * 类描述：
 * 修改人：
 * 修改时间：
 * TEL：18627795967
 */
public class Student implements Parcelable {
    private String name;
    private int age;

    private Score score;




    class Score  implements Parcelable {
        int math;
        int English;

        protected Score(Parcel in) {
            math = in.readInt();
            English = in.readInt();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(math);
            dest.writeInt(English);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public final Creator<Score> CREATOR = new Creator<Score>() {
            @Override
            public Score createFromParcel(Parcel in) {
                return new Score(in);
            }

            @Override
            public Score[] newArray(int size) {
                return new Score[size];
            }
        };
    }

    protected Student(Parcel in) {
        name = in.readString();
        age = in.readInt();
        score = in.readParcelable(Score.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeParcelable(score, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Student> CREATOR = new Creator<Student>() {
        @Override
        public Student createFromParcel(Parcel in) {
            return new Student(in);
        }

        @Override
        public Student[] newArray(int size) {
            return new Student[size];
        }
    };
}
