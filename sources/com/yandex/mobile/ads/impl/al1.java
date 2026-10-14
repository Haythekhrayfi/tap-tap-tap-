package com.yandex.mobile.ads.impl;

import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class al1 implements lm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f18952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SSLSocketFactory f18953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f18954f;

    public al1(String str, SSLSocketFactory sSLSocketFactory, boolean z10) {
        fd.j0.i(str, "userAgent");
        this.f18949a = str;
        this.f18950b = 8000;
        this.f18951c = 8000;
        this.f18952d = false;
        this.f18953e = sSLSocketFactory;
        this.f18954f = z10;
    }

    @Override // com.yandex.mobile.ads.impl.lm.a
    public final lm a() {
        if (!this.f18954f) {
            return new yk1(this.f18949a, this.f18950b, this.f18951c, this.f18952d, new s00(), this.f18953e);
        }
        int i10 = zn0.f27375c;
        return new co0(zn0.a(this.f18950b, this.f18951c, this.f18953e), this.f18949a, new s00());
    }
}
