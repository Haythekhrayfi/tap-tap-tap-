package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.d7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1577d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2025v7 f15915a;

    public C1577d7() {
        this(new C2025v7());
    }

    public C1577d7(C2025v7 c2025v7) {
        this.f15915a = c2025v7;
    }

    public C1846o2.f a(C1876p7 c1876p7, C1746k2 c1746k2) {
        String strB;
        C1826n7 c1826n7 = c1876p7.f17056a;
        String str = "";
        if (c1826n7 != null && (strB = c1826n7.b()) != null) {
            str = strB;
        }
        byte[] bArrA = this.f15915a.a(c1876p7);
        Im imB = AbstractC2145zm.b(c1746k2.b().c());
        List<Integer> list = J0.f14266i;
        S s10 = new S(bArrA, str, EnumC1745k1.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF.b(), imB);
        s10.c(c1746k2.d());
        return new C1846o2.f(s10, c1746k2).a(s10.s()).a(true);
    }
}
