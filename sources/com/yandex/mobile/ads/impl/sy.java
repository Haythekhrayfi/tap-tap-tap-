package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class sy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.f f25208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f25209b;

    public sy(qd.f fVar) {
        fd.j0.i(fVar, "source");
        this.f25208a = fVar;
        this.f25209b = 262144L;
    }

    public final ry a() throws IOException {
        ry.a aVar = new ry.a();
        while (true) {
            String strB = b();
            if (strB.length() == 0) {
                return aVar.a();
            }
            aVar.a(strB);
        }
    }

    public final String b() throws IOException {
        String strD = this.f25208a.D(this.f25209b);
        this.f25209b -= (long) strD.length();
        return strD;
    }
}
