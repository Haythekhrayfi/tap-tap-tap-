package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
final class m41 extends aw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22910b;

    public m41(xn xnVar, long j10) {
        super(xnVar);
        pa.a(xnVar.getPosition() >= j10);
        this.f22910b = j10;
    }

    @Override // com.yandex.mobile.ads.impl.aw, com.yandex.mobile.ads.impl.vt
    public final long a() {
        return super.a() - this.f22910b;
    }

    @Override // com.yandex.mobile.ads.impl.aw, com.yandex.mobile.ads.impl.vt
    public final long e() {
        return super.e() - this.f22910b;
    }

    @Override // com.yandex.mobile.ads.impl.aw, com.yandex.mobile.ads.impl.vt
    public final long getPosition() {
        return super.getPosition() - this.f22910b;
    }
}
