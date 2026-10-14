package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* JADX INFO: loaded from: classes.dex */
public class R8 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS binary_data");
    }
}
