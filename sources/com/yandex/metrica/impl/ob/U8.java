package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* JADX INFO: loaded from: classes.dex */
public class U8 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(O8.d.f14624b);
        sQLiteDatabase.execSQL(O8.e.f14626b);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}
