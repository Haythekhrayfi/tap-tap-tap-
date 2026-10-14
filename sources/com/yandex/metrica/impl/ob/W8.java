package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* JADX INFO: loaded from: classes.dex */
public class W8 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
    }
}
