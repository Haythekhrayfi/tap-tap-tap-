package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1778l9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN truncated INTEGER DEFAULT 0");
    }
}
