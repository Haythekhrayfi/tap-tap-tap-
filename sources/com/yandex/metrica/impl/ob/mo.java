package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class mo implements Comparator<Z2> {
    @Override // java.util.Comparator
    public int compare(Z2 z10, Z2 z11) {
        Z2 z12 = z10;
        Z2 z13 = z11;
        return (TextUtils.equals(z12.f15607a, z13.f15607a) && TextUtils.equals(z12.f15608b, z13.f15608b)) ? 0 : 10;
    }
}
