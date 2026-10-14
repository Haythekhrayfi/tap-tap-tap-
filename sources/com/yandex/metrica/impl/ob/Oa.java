package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
class Oa implements InterfaceC2106y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final L8 f14629a;

    public Oa(L8 l10, String str) {
        this.f14629a = l10;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2106y8
    public void a(String str, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = this.f14629a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data_key", str);
                    contentValues.put("value", bArr);
                    sQLiteDatabaseA.insertWithOnConflict("binary_data", null, contentValues, 5);
                } catch (Throwable unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    sQLiteDatabaseA = sQLiteDatabase;
                }
            }
        } catch (Throwable unused2) {
        }
        this.f14629a.a(sQLiteDatabaseA);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003f A[Catch: all -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:8:0x001e, B:10:0x0024, B:12:0x002a, B:16:0x003f), top: B:25:0x001e }] */
    @Override // com.yandex.metrica.impl.ob.InterfaceC2106y8
    public byte[] a(String str) {
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseA;
        byte[] blob = null;
        try {
            sQLiteDatabaseA = this.f14629a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    cursorQuery = sQLiteDatabaseA.query("binary_data", null, "data_key = ?", new String[]{str}, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                                blob = cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("value"));
                            } else if (cursorQuery != null) {
                                cursorQuery.getCount();
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (cursorQuery != null) {
                        cursorQuery.getCount();
                    }
                } catch (Throwable unused2) {
                    cursorQuery = null;
                }
            } else {
                cursorQuery = null;
            }
        } catch (Throwable unused3) {
            cursorQuery = null;
            sQLiteDatabaseA = null;
        }
        U2.a(cursorQuery);
        this.f14629a.a(sQLiteDatabaseA);
        return blob;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2106y8
    public void b(String str) {
        SQLiteDatabase sQLiteDatabaseA;
        try {
            sQLiteDatabaseA = this.f14629a.a();
            if (sQLiteDatabaseA != null) {
                try {
                    new ContentValues().put("data_key", str);
                    sQLiteDatabaseA.delete("binary_data", "data_key = ?", new String[]{str});
                } catch (Throwable unused) {
                }
            }
        } catch (Throwable unused2) {
            sQLiteDatabaseA = null;
        }
        this.f14629a.a(sQLiteDatabaseA);
    }
}
