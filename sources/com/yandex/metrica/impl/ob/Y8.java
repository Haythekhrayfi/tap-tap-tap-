package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* JADX INFO: loaded from: classes.dex */
public class Y8 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS preferences (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS startup (key TEXT PRIMARY KEY,value TEXT,type INTEGER)");
        sQLiteDatabase.execSQL(O8.a.b.f14619a);
        sQLiteDatabase.execSQL(O8.a.InterfaceC0176a.f14617a);
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS binary_data (data_key TEXT PRIMARY KEY,value BLOB)");
    }
}
