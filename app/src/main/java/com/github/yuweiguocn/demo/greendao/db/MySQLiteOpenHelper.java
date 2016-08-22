package com.github.yuweiguocn.demo.greendao.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.github.yuweiguocn.demo.greendao.db.dao.DaoMaster;
import com.github.yuweiguocn.demo.greendao.db.dao.TestData2Dao;
import com.github.yuweiguocn.demo.greendao.db.dao.TestData3Dao;
import com.github.yuweiguocn.demo.greendao.db.dao.TestDataDao;
import com.github.yuweiguocn.library.greendao.MigrationHelper;
import org.greenrobot.greendao.database.Database;

/**
 * Created by Growth on 2016/3/3.
 */
public class MySQLiteOpenHelper extends DaoMaster.OpenHelper {
  public MySQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
    super(context, name, factory);
  }

  @Override public void onUpgrade(Database db, int oldVersion, int newVersion) {
    MigrationHelper.migrate(db, TestDataDao.class, TestData2Dao.class, TestData3Dao.class);
  }
}
