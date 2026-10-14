package com.yandex.metrica.impl.ob;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L8 f13765a;

    public C8(L8 l10, String str) {
        this.f13765a = l10;
    }

    public C8(C2056w8 c2056w8, String str) {
        this(new N8(c2056w8), str);
    }

    public void a() {
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.f13765a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.execSQL("DROP TABLE IF EXISTS permissions");
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseA = null;
        }
        this.f13765a.a(sQLiteDatabaseA);
    }

    public List<C1709ie> b() {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorQuery;
        try {
            sQLiteDatabaseA = this.f13765a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    cursorQuery = sQLiteDatabaseA.query("permissions", null, null, null, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                ArrayList arrayList = new ArrayList();
                                do {
                                    arrayList.add(new C1709ie(cursorQuery.getString(cursorQuery.getColumnIndex("name")), cursorQuery.getLong(cursorQuery.getColumnIndex("granted")) == 1));
                                } while (cursorQuery.moveToNext());
                                this.f13765a.a(sQLiteDatabaseA);
                                U2.a(cursorQuery);
                                return arrayList;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable unused2) {
                    cursorQuery = null;
                }
            } else {
                cursorQuery = null;
            }
        } catch (Throwable unused3) {
            sQLiteDatabaseA = null;
            cursorQuery = null;
        }
        this.f13765a.a(sQLiteDatabaseA);
        U2.a(cursorQuery);
        return null;
    }
}
