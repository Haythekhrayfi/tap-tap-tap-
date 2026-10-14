package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class qy0 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IOException f24574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f24575b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy0(IOException iOException) {
        super(iOException);
        fd.j0.i(iOException, "firstConnectException");
        this.f24574a = iOException;
        this.f24575b = iOException;
    }

    public final IOException a() {
        return this.f24574a;
    }

    public final void a(IOException iOException) {
        fd.j0.i(iOException, "e");
        jc.a.a(this.f24574a, iOException);
        this.f24575b = iOException;
    }

    public final IOException b() {
        return this.f24575b;
    }
}
