package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public class M8 implements L8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E8 f14476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1543bn f14477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private C2056w8 f14478e;

    public M8(Context context, String str, C1543bn c1543bn, E8 e10) {
        this.f14474a = context;
        this.f14475b = str;
        this.f14477d = c1543bn;
        this.f14476c = e10;
    }

    @Override // com.yandex.metrica.impl.ob.L8
    public synchronized SQLiteDatabase a() {
        C2056w8 c2056w8;
        try {
            this.f14477d.a();
            c2056w8 = new C2056w8(this.f14474a, this.f14475b, this.f14476c);
            this.f14478e = c2056w8;
        } catch (Throwable unused) {
            return null;
        }
        return c2056w8.getWritableDatabase();
    }

    @Override // com.yandex.metrica.impl.ob.L8
    public synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        U2.a((Closeable) this.f14478e);
        this.f14477d.b();
        this.f14478e = null;
    }
}
