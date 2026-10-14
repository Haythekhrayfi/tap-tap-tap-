package com.yandex.metrica.impl.ob;

import android.os.Process;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1752k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f16572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X7 f16573d;

    public C1752k8(String str, boolean z10, X7 x10) {
        this(str, z10, x10, U2.a(23) && Process.is64Bit());
    }

    public C1752k8(String str, boolean z10, X7 x10, boolean z11) {
        this.f16570a = str;
        this.f16572c = z10;
        this.f16573d = x10;
        this.f16571b = z11;
    }
}
