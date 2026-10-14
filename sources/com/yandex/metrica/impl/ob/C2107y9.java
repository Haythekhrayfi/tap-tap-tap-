package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import java.sql.SQLException;
import java.util.Locale;
import org.json.JSONException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2107y9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException, JSONException {
        sQLiteDatabase.execSQL(String.format(Locale.US, "ALTER TABLE %s ADD COLUMN %s INTEGER DEFAULT %d", "reports", "call_state", 0));
    }
}
