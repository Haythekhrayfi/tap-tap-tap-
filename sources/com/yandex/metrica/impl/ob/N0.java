package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public enum N0 {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14527a;

    N0(int i10) {
        this.f14527a = i10;
    }

    public static N0 a(Integer num) {
        if (num != null) {
            N0[] n0ArrValues = values();
            for (int i10 = 0; i10 < 3; i10++) {
                N0 n10 = n0ArrValues[i10];
                if (n10.f14527a == num.intValue()) {
                    return n10;
                }
            }
        }
        return UNKNOWN;
    }
}
