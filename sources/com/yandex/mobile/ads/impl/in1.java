package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class in1 {
    public static void a(em1 em1Var) {
        if (!em1Var.g()) {
            throw new IllegalStateException("AdSession is not started");
        }
        if (em1Var.j()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }
}
