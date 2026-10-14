package com.yandex.metrica.impl.ob;

import java.io.IOException;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1644g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f16154a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f16155b = new String[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[][] f16156c = new byte[0][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f16157d = new byte[0];

    public static int a(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    public static final int a(C1494a c1494a, int i10) throws IOException {
        int iB = c1494a.b();
        c1494a.f(i10);
        int i11 = 1;
        while (c1494a.l() == i10) {
            c1494a.f(i10);
            i11++;
        }
        c1494a.e(iB);
        return i11;
    }
}
