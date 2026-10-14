package com.applovin.exoplayer2.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class ah {
    public static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(android.support.v4.media.a.a("at index ", i10));
    }

    public static Object[] a(Object... objArr) {
        return b(objArr, objArr.length);
    }

    public static <T> T[] a(T[] tArr, int i10) {
        return (T[]) aj.a(tArr, i10);
    }

    public static Object[] b(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }
}
