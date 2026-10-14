package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sp1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc.a f25166d;

    public /* synthetic */ sp1(uc.a aVar, int i10) {
        this.f25165c = i10;
        this.f25166d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25165c) {
            case 0:
                r9.a(this.f25166d);
                break;
            default:
                y9.a(this.f25166d);
                break;
        }
    }
}
