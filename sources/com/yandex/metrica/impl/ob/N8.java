package com.yandex.metrica.impl.ob;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public class N8 implements L8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2056w8 f14537a;

    public N8(C2056w8 c2056w8) {
        this.f14537a = c2056w8;
    }

    @Override // com.yandex.metrica.impl.ob.L8
    public SQLiteDatabase a() {
        try {
            return this.f14537a.getWritableDatabase();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.yandex.metrica.impl.ob.L8
    public void a(SQLiteDatabase sQLiteDatabase) {
    }
}
