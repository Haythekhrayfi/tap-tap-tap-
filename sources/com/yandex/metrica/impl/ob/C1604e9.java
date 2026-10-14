package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1604e9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS permissions (name TEXT PRIMARY KEY,granted INTEGER)");
    }
}
