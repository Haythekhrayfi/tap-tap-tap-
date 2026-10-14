package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class n60 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f23239a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n60(String str) {
        super(str);
        fd.j0.i(str, "message");
        this.f23239a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f23239a;
    }
}
