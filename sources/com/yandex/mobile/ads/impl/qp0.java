package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class qp0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24555b;

    public qp0(String str, Exception exc, boolean z10, int i10) {
        super(str, exc);
        this.f24554a = z10;
        this.f24555b = i10;
    }

    public static qp0 a(String str) {
        return new qp0(str, null, false, 1);
    }

    public static qp0 a(String str, Exception exc) {
        return new qp0(str, exc, true, 1);
    }

    public static qp0 a(String str, IllegalArgumentException illegalArgumentException) {
        return new qp0(str, illegalArgumentException, true, 0);
    }
}
