package com.yandex.mobile.ads.embedded.guava.collect;

/* JADX INFO: loaded from: classes.dex */
final class h {
    public static int a(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }
}
