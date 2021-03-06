package me.mvp.demo.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import me.logg.Logg;
import me.mvp.demo.entity.User;
import me.mvp.demo.entity.UserDao;
import me.mvp.frame.di.component.AppComponent;

/**
 * 数据库
 */
@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao userDao();

    public static AppDatabase get(AppComponent component) {
        return (AppDatabase) component.dbManager().database();
    }
}