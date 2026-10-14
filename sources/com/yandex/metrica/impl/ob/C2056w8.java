package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.Closeable;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.w8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2056w8 extends SQLiteOpenHelper implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Im f17768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final E8 f17769c;

    public C2056w8(Context context, String str, E8 e10) {
        this(context, str, e10, AbstractC2145zm.a());
    }

    public C2056w8(Context context, String str, E8 e10, Im im) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, O8.f14612a);
        this.f17769c = e10;
        this.f17767a = str;
        this.f17768b = im;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getReadableDatabase() {
        try {
            return super.getReadableDatabase();
        } catch (Throwable th) {
            this.f17768b.a(th, "", new Object[0]);
            this.f17768b.b("Could not get readable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f17767a);
            ((Nh) Oh.a()).reportError("db_read_error", th);
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (Throwable th) {
            this.f17768b.a(th, "", new Object[0]);
            this.f17768b.b("Could not get writable database %s due to an exception. AppMetrica SDK may behave unexpectedly.", this.f17767a);
            ((Nh) Oh.a()).reportError("db_write_error", th);
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        this.f17769c.a(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f17769c.a(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        this.f17769c.b(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f17769c.b(sQLiteDatabase, i10, i11);
    }
}
