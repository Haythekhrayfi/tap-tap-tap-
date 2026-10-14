package com.yandex.metrica.impl.ob;

/* JADX INFO: loaded from: classes.dex */
public enum I0 {
    NATIVE(0),
    JS(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14171a;

    I0(int i10) {
        this.f14171a = i10;
    }

    public static I0 a(int i10) {
        I0[] i0ArrValues = values();
        for (int i11 = 0; i11 < 2; i11++) {
            I0 i12 = i0ArrValues[i11];
            if (i12.f14171a == i10) {
                return i12;
            }
        }
        return NATIVE;
    }
}
