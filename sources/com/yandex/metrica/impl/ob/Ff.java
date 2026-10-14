package com.yandex.metrica.impl.ob;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public class Ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static SparseArray<String> f13999a;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        f13999a = sparseArray;
        sparseArray.put(0, "String");
        f13999a.put(1, "Number");
        f13999a.put(2, "Counter");
    }

    public static String a(int i10) {
        return f13999a.get(i10);
    }
}
