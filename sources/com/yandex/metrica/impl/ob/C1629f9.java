package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import org.json.JSONException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1629f9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL(O8.a.b.f14619a);
    }
}
