package com.yandex.mobile.ads.embedded.guava.collect;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class e0 {
    public static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }
}
