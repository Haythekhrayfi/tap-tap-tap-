package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.9I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C9I extends Exception {
    public final int A00;
    public final int A01;

    public C9I(int i10, String str, Throwable th, int i11) {
        super(str, th);
        this.A01 = i10;
        this.A00 = i11;
    }

    public static C9I A00(IOException iOException) {
        return new C9I(0, null, iOException, -1);
    }

    public static C9I A01(Exception exc, int i10) {
        return new C9I(1, null, exc, i10);
    }

    public static C9I A02(RuntimeException runtimeException) {
        return new C9I(2, null, runtimeException, -1);
    }
}
