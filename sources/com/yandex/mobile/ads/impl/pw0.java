package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class pw0 extends qw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tc0 f24266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte[] f24268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f24269d;

    public pw0(tc0 tc0Var, byte[] bArr, int i10, int i11) {
        this.f24266a = tc0Var;
        this.f24267b = i10;
        this.f24268c = bArr;
        this.f24269d = i11;
    }

    @Override // com.yandex.mobile.ads.impl.qw0
    public final long a() {
        return this.f24267b;
    }

    @Override // com.yandex.mobile.ads.impl.qw0
    public final void a(qd.e eVar) throws IOException {
        fd.j0.i(eVar, "sink");
        eVar.write(this.f24268c, this.f24269d, this.f24267b);
    }

    @Override // com.yandex.mobile.ads.impl.qw0
    public final tc0 b() {
        return this.f24266a;
    }
}
