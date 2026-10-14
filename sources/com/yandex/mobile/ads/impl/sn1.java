package com.yandex.mobile.ads.impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sn1 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f25144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bx0.c f25145d;

    public /* synthetic */ sn1(bx0.c cVar, int i10) {
        this.f25144c = i10;
        this.f25145d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25144c) {
            case 0:
                this.f25145d.b();
                break;
            default:
                this.f25145d.a();
                break;
        }
    }
}
