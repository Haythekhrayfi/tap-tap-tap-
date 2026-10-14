package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class E8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final P8 f13868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P8 f13869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<P8> f13870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final F8 f13871d;

    public static class b {
        public E8 a(String str, P8 p10, P8 p11, SparseArray<P8> sparseArray, F8 f10) {
            return new E8(str, p10, p11, sparseArray, f10);
        }
    }

    private E8(String str, P8 p10, P8 p11, SparseArray<P8> sparseArray, F8 f10) {
        this.f13868a = p10;
        this.f13869b = p11;
        this.f13870c = sparseArray;
        this.f13871d = f10;
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f13868a.a(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    public void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 > i11) {
            try {
                this.f13869b.a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            try {
                this.f13868a.a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
        }
    }

    public void b(SQLiteDatabase sQLiteDatabase) {
        try {
            F8 f10 = this.f13871d;
            if (f10 == null || ((G8) f10).a(sQLiteDatabase)) {
                return;
            }
            try {
                this.f13869b.a(sQLiteDatabase);
            } catch (Throwable unused) {
            }
            this.f13868a.a(sQLiteDatabase);
        } catch (Throwable unused2) {
        }
    }

    public void b(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        boolean z10;
        if (i11 > i10) {
            z10 = false;
            for (int i12 = i10 + 1; i12 <= i11; i12++) {
                try {
                    P8 p10 = this.f13870c.get(i12);
                    if (p10 != null) {
                        p10.a(sQLiteDatabase);
                    }
                } catch (Throwable unused) {
                }
            }
        } else {
            z10 = true;
        }
        if ((!((G8) this.f13871d).a(sQLiteDatabase)) || z10) {
            try {
                this.f13869b.a(sQLiteDatabase);
            } catch (Throwable unused2) {
            }
            try {
                this.f13868a.a(sQLiteDatabase);
            } catch (Throwable unused3) {
            }
        }
    }
}
