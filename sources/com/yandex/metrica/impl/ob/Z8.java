package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;

/* JADX INFO: loaded from: classes.dex */
public class Z8 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_id_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS api_level_info");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS preferences");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS startup");
        sQLiteDatabase.execSQL(O8.a.b.f14620b);
        sQLiteDatabase.execSQL(O8.a.InterfaceC0176a.f14618b);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS permissions");
    }
}
