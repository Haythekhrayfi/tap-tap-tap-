package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.dn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1593dn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15979a;

    public C1593dn(Context context) {
        this.f15979a = context;
    }

    public byte[] a() {
        try {
            return C2120ym.b(new StringBuilder(this.f15979a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    public byte[] b() {
        try {
            return C2120ym.b(this.f15979a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
