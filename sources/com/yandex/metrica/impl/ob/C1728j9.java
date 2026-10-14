package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.sql.SQLException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.j9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1728j9 extends P8 {
    @Override // com.yandex.metrica.impl.ob.P8
    public void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN environment TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE reports ADD COLUMN user_info TEXT ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ALTER TABLE ");
        sb2.append("reports");
        v.e.a(sb2, " ADD COLUMN ", "session_type", " INTEGER DEFAULT ");
        EnumC2129z6 enumC2129z6 = EnumC2129z6.FOREGROUND;
        sb2.append(enumC2129z6.a());
        sQLiteDatabase.execSQL(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("UPDATE ");
        sb3.append("reports");
        v.e.a(sb3, " SET ", "session_type", " = ");
        EnumC2129z6 enumC2129z7 = EnumC2129z6.BACKGROUND;
        sb3.append(enumC2129z7.a());
        sb3.append(" WHERE ");
        sb3.append("session_id");
        sb3.append(" = ");
        sb3.append(-2L);
        sQLiteDatabase.execSQL(sb3.toString());
        sQLiteDatabase.execSQL("ALTER TABLE sessions ADD COLUMN server_time_offset INTEGER ");
        StringBuilder sb4 = new StringBuilder();
        j1.d.a(sb4, "ALTER TABLE ", "sessions", " ADD COLUMN ", "type");
        sb4.append(" INTEGER DEFAULT ");
        sb4.append(enumC2129z6.a());
        sQLiteDatabase.execSQL(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append("UPDATE ");
        j1.d.a(sb5, "sessions", " SET ", "type", " = ");
        sb5.append(enumC2129z7.a());
        sb5.append(" WHERE ");
        sb5.append(FacebookMediationAdapter.KEY_ID);
        sb5.append(" = ");
        sb5.append(-2L);
        sQLiteDatabase.execSQL(sb5.toString());
    }
}
