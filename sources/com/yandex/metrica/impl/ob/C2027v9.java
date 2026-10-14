package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2027v9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN report_request_parameters TEXT DEFAULT ''");
    }
}
