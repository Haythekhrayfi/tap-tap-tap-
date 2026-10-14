package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes3.dex */
public interface qv0 {
    static int a(int i10) {
        return i10 | 0 | 0 | 0 | 128;
    }

    @SuppressLint({"WrongConstant"})
    static int b(int i10) {
        return i10 & 128;
    }

    @SuppressLint({"WrongConstant"})
    static int c(int i10) {
        return i10 & 64;
    }

    int a(yv yvVar) throws ns;

    int f() throws ns;

    String getName();
}
