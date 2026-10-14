package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1753k9 extends P8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f16574a;

    static {
        StringBuilder sbA = defpackage.a.a("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT ");
        sbA.append(EnumC2129z6.FOREGROUND.a());
        sbA.append(",");
        sbA.append("app_environment");
        sbA.append(" TEXT DEFAULT '");
        j1.d.a(sbA, "{}", "',", "app_environment_revision", " INTEGER DEFAULT ");
        f16574a = android.support.v4.media.session.e.a(sbA, 0L, " )");
    }

    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws Throwable {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN app_environment TEXT DEFAULT '{}'");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN app_environment_revision INTEGER DEFAULT 0");
        sQLiteDatabase.execSQL("ALTER TABLE reports RENAME TO reports_backup");
        sQLiteDatabase.execSQL(f16574a);
        Cursor cursor = null;
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM reports_backup", null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                    String asString = contentValues.getAsString("environment");
                    contentValues.remove("environment");
                    contentValues.put("error_environment", asString);
                    sQLiteDatabase.insert("reports", null, contentValues);
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorRawQuery;
                    U2.a(cursor);
                    throw th;
                }
            }
            U2.a(cursorRawQuery);
            sQLiteDatabase.execSQL("DROP TABLE reports_backup");
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
